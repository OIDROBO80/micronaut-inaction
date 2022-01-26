package co.com.bancodebogota.client;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;

@Client("/api/${api.version:v1}")
public interface ReqresClient {

    @Get("users/{iduser}")
    HttpResponse informationUserData(@PathVariable("iduser") int idUser);

    @Get("users/list/{idPage}")
    HttpResponse informationUsersListData(@PathVariable("idPage")int idPage);

    @Post("users")
    HttpResponse createUser();

    @Put("users/{idUser}")
    HttpResponse updateUser(@PathVariable("idUser") int idUser);

    @Delete("users/{idUser}")
    HttpResponse deleteUser(@PathVariable("idUser") int idUser);



}
