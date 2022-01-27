package co.com.bancodebogota.context.account.limits.infrastructure;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;

@Client("${api.regres.url}")
public interface ApiReqres {

    @Get("users/{iduser}")
    DataUser getUserData(@PathVariable("iduser") int idUser);

    @Get("users?page={idPage}")
    DataUsers getUsersListData(@PathVariable("idPage")int idPage);

    @Post("users")
    Object createUser();

    @Put("users/{idUser}")
    Object updateUser(@PathVariable("idUser") int idUser);

    @Delete("users/{idUser}")
    void deleteUser(@PathVariable("idUser") int idUser);


}
