package co.com.bancodebogota.context.account.limits.infrastructure.reqres;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import org.reactivestreams.Publisher;

@Client(value = "${api.regres.url}")

public interface ApiReqres {

    @Get("users/{iduser}")
    HttpResponse<DataUser> getUserById(@PathVariable("iduser") int idUser);

    @Post("users")
    HttpResponse<Object> createUser();

}
