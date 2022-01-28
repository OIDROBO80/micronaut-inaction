package co.com.bancodebogota.client;

import co.com.bancodebogota.context.domain.user.DataUser;
import co.com.bancodebogota.context.domain.user.DataUsers;
import io.micronaut.http.annotation.*;

public interface ReqresClient {

    Object myselfApi();

    DataUser byId(@PathVariable("iduser") int idUser);


    DataUsers byPage(@PathVariable("idPage")int idPage);

    Object create();


    //HttpResponse createUser();

    /*
    HttpResponse updateUser(@PathVariable("idUser") int idUser);


    HttpResponse deleteUser(@PathVariable("idUser") int idUser);*/



}
