package mx.quickriders.icolaborate.chefs.service.impl;

import mx.quickriders.icolaborate.chefs.domain.Chef;
import mx.quickriders.icolaborate.chefs.event.*;
import mx.quickriders.icolaborate.chefs.mapper.ChefMapper;
import mx.quickriders.icolaborate.chefs.service.ChefService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Future;

/**
 * Created by PINA on 08/03/2017.
 */
@Service
public class ChefServiceImpl implements ChefService {

    @Autowired
    private ChefMapper chefMapper;

    @Override
    @Async
    @Cacheable(value = "chefs")
    public Future<ResponseChefsEvent> requestChefs(final RequestChefsEvent requestChefsEvent) {

        final int offset = (requestChefsEvent.getNumberPage() - 1) * requestChefsEvent.getRecordsPerPage();
        final int limit = requestChefsEvent.getNumberPage() * requestChefsEvent.getRecordsPerPage();

        final List<Chef> chefs = this.chefMapper.findAllChefs(new RowBounds(offset, limit));
        final long total = this.chefMapper.countAllChefs();

        return new AsyncResult<>(ResponseChefsEvent.builder().chefs(chefs).total(total).build());
    }

    @Override
    public Future<ResponseChefEvent> createChef(final CreateChefEvent createChefEvent) {
        return null;
    }

    @Override
    public Future<ResponseChefEvent> requestChef(final RequestChefEvent requestChefEvent) {
        return null;
    }

    @Override
    public Future<ResponseChefEvent> updateChef(final UpdateChefEvent updateChefEvent) {
        return null;
    }

    @Override
    public void deleteChef(final DeleteChefEvent deleteChefEvent) {

    }
}
