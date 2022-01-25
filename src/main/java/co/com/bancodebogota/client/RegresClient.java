package co.com.bancodebogota.client;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;

@Client("/users")
public interface RegresClient {

    @Get("/{iduser}")
    String informationUser(@PathVariable("iduser") int idUser);

    @Put("/{iduser}")
    void updateUser(@PathVariable("iduser") int idUser);
}
