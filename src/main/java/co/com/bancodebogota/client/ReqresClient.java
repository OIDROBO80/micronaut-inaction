package co.com.bancodebogota.client;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;

public interface ReqresClient {

    DataUser byId(@PathVariable("iduser") int idUser);
    Object create();
}
