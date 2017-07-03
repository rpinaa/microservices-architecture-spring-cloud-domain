package mx.quickriders.icolaborate.chefs.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.quickriders.icolaborate.chefs.domain.Chef;
import mx.quickriders.icolaborate.chefs.group.ChefCreateGroup;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by PINA on 08/03/2017.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateChefEvent {

    @Valid
    @NotNull(groups = {ChefCreateGroup.class})
    private Chef chef;
}
