package co.com.bancodebogota.client;

import co.com.bancodebogota.context.domain.response.Response;
import co.com.bancodebogota.context.domain.user.DataUser;
import co.com.bancodebogota.context.domain.user.DataUsers;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

public interface ReqresClient {

    HttpResponse<DataUser> GetUser(@PathVariable("iduser") int idUser);


    HttpResponse<DataUsers> GetUsersList(@PathVariable("idPage")int idPage);

    HttpResponse<Response> createUser();



}
