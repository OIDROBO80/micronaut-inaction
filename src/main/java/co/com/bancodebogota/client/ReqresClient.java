package co.com.bancodebogota.client;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client("/api/${api.version:v1}")
public interface ReqresClient {

    @Get("users/{iduser}")
    DataUser informationUserData(@PathVariable("iduser") int idUser);

    @Get("users/list/{idUsers}")
    DataUsers informationUsersListData(@PathVariable("idUsers")int idUsers);

    @Post("users")
    Object createUser();



}
