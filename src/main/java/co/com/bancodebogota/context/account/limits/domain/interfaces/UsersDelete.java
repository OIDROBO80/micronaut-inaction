package co.com.bancodebogota.context.account.limits.domain.interfaces;

import io.micronaut.http.HttpResponse;

public interface UsersDelete {

    HttpResponse run(int idUser);
}
