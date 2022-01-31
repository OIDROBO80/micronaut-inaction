package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.http.HttpResponse;

public interface UserRepository {
    // Get User Reqres by id
    DataUser getUserData(int idUser);
    Object createUser();
}
