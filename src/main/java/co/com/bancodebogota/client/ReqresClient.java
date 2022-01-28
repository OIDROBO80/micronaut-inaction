package co.com.bancodebogota.client;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;


public interface ReqresClient {

    @Get("users/{iduser}")
    HttpResponse informationUserData(@PathVariable("iduser") int idUser);

}
