package mx.quickriders.icolaborate.chefs.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by PINA on 08/03/2017.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteChefEvent {
    private UUID id;
}
