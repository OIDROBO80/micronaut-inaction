package co.com.bancodebogota.context.account.limits.infrastructure.reqres;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

@Client("${api.regres.url}")
public interface ApiReqres {


    @Get("users/apimyself")
    Object getApiMyself();

    @Get("users/{iduser}")
    DataUser getUserById(@PathVariable("iduser") int idUser);

    @Get("users?page={idPage}")
    DataUsers getUsersListByPage(@PathVariable("idPage")int idPage);

    @Post("users")
    Object createUser();
}
