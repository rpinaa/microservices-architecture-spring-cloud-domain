package mx.quickriders.icolaborate.chefs.mapper;

import mx.quickriders.icolaborate.chefs.domain.Chef;
import mx.quickriders.icolaborate.chefs.event.CreateChefEvent;
import mx.quickriders.icolaborate.chefs.event.DeleteChefEvent;
import mx.quickriders.icolaborate.chefs.event.RequestChefEvent;
import mx.quickriders.icolaborate.chefs.event.UpdateChefEvent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created by PINA on 08/03/2017.
 */
@Mapper
public interface ChefMapper {

    int createChef(final CreateChefEvent createChefEvent);

    long countAllChefs();

    List<Chef> findAllChefs(final RowBounds rb);

    Chef findChefById(final RequestChefEvent requestChefEvent);

    int saveChef(final UpdateChefEvent updateChefEvent);

    int deleteChef(final DeleteChefEvent id);
}
