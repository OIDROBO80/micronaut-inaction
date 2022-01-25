package co.com.bancodebogota.client;

import co.com.bancodebogota.context.account.limits.domain.user.Data;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;

@Client("/users")
public interface RegresClient {

    @Get("/{iduser}")
    DataUser informationUserData(@PathVariable("iduser") int idUser);


}
