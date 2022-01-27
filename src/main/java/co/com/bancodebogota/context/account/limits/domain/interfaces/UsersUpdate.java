package co.com.bancodebogota.context.account.limits.domain.interfaces;


import io.micronaut.http.HttpResponse;

public interface UsersUpdate {
    HttpResponse run(int idUser);
}
