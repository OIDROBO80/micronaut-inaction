package co.com.bancodebogota.context.account.limits.infrastructure;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;

@Client("${api.regres.url}")
public interface ApiReqres {

    //@Get("users/{iduser}")
    //Data informationUserData(@PathVariable("iduser") int idUser);

    @Get("users/{iduser}")
    DataUser informationUserData(@PathVariable("iduser") int idUser);


}
