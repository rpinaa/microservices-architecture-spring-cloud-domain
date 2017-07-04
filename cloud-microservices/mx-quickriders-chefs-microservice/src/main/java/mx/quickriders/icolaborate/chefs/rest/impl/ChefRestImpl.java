package mx.quickriders.icolaborate.chefs.rest.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import mx.quickriders.icolaborate.chefs.event.RequestChefsEvent;
import mx.quickriders.icolaborate.chefs.event.ResponseChefsEvent;
import mx.quickriders.icolaborate.chefs.rest.ChefRest;
import mx.quickriders.icolaborate.chefs.service.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * Created by PINA on 08/03/2017.
 */
@RestController("/chefs")
public class ChefRestImpl implements ChefRest {

    @Autowired
    private ChefService chefService;

    @HystrixCommand(groupKey = "helloGroup", fallbackMethod = "fallBackCall")
    public Callable<ResponseChefsEvent> getChefs(final int numberPage, final int recordsPerPage) throws ExecutionException {

        final RequestChefsEvent requestChefsEvent = RequestChefsEvent.builder()
                .numberPage(numberPage)
                .recordsPerPage(recordsPerPage)
                .build();

        return () -> chefService.requestChefs(requestChefsEvent).get();
    }

    public Callable<ResponseChefsEvent> fallBackCall(final int numberPage, final int recordsPerPage) {
        return () -> null;
    }
}
