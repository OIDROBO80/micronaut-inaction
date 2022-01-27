package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.http.HttpResponse;

public interface UsersFinder{

    HttpResponse run(int idUser);
}
