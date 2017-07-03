package mx.quickriders.icolaborate.chefs.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.quickriders.icolaborate.chefs.domain.Chef;

import java.util.List;

/**
 * Created by PINA on 08/03/2017.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseChefsEvent {

    private Long total;
    private List<Chef> chefs;
}
