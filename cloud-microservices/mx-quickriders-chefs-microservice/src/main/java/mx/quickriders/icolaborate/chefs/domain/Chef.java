package mx.quickriders.icolaborate.chefs.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import mx.quickriders.icolaborate.chefs.group.ChefCreateGroup;
import mx.quickriders.icolaborate.chefs.group.ChefUpdateGroup;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

/**
 * Created by PINA on 08/03/2017.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Chef extends Momentum {

    public Chef() {
        this.id = UUID.randomUUID();
    }

    @NotNull(groups = {ChefUpdateGroup.class})
    private UUID id;

    @Size(min = 3, max = 80, groups = {ChefCreateGroup.class, ChefUpdateGroup.class})
    @NotEmpty(groups = {ChefCreateGroup.class, ChefUpdateGroup.class})
    private String title;

    @Size(min = 3, max = 150, groups = {ChefCreateGroup.class, ChefUpdateGroup.class})
    @NotEmpty(groups = {ChefCreateGroup.class, ChefUpdateGroup.class})
    private String description;
}
