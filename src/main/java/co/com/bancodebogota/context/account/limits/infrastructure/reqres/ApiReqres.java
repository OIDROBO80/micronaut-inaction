package co.com.bancodebogota.context.account.limits.infrastructure.reqres;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client(value = "${api.regres.url}")

public interface ApiReqres {

    @Get("users/{iduser}")
    HttpResponse<DataUser> getUserById(@PathVariable("iduser") int idUser);

    @Get("user/{idUser}")
    HttpResponse<DataUser> getUserMockoon(@PathVariable("idUser") int idUser);

    @Post("users")
    HttpResponse<Object> createUser();

}
