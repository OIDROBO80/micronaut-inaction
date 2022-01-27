package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.http.HttpResponse;

public interface UsersListFinder {
    HttpResponse run(int idPage);
}
