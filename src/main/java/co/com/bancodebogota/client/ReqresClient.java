package co.com.bancodebogota.client;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;

@Client("/api/${api.version:v1}")
public interface ReqresClient {

    @Get("users/{iduser}")
    DataUser informationUserData(@PathVariable("iduser") int idUser);

    @Get("users/list/{idPage}")
    DataUsers informationUsersListData(@PathVariable("idPage")int idPage);

    @Post("users")
    Object createUser();

    @Put("users/{idUser}")
    Object updateUser(@PathVariable("idUser") int idUser);



}
