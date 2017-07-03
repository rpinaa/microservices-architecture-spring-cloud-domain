package mx.quickriders.icolaborate.chefs.rest;

import mx.quickriders.icolaborate.chefs.event.ResponseChefsEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * Created by PINA on 08/03/2017.
 */
public interface ChefRest {

    @GetMapping
    Callable<ResponseChefsEvent> getChefs(@RequestParam("numberPage") final int numberPage, @RequestParam("recordsPerPage") final int recordsPerPage) throws ExecutionException;
}
