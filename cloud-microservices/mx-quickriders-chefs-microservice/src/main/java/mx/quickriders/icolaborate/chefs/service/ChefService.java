package mx.quickriders.icolaborate.chefs.service;

import mx.quickriders.icolaborate.chefs.event.*;

import java.util.concurrent.Future;

/**
 * Created by PINA on 08/03/2017.
 */

public interface ChefService {

    Future<ResponseChefsEvent> requestChefs(final RequestChefsEvent requestChefsEvent);

    Future<ResponseChefEvent> createChef(final CreateChefEvent createChefEvent);

    Future<ResponseChefEvent> requestChef(final RequestChefEvent requestChefEvent);

    Future<ResponseChefEvent> updateChef(final UpdateChefEvent updateChefEvent);

    void deleteChef(final DeleteChefEvent deleteChefEvent);
}
