package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.http.HttpResponse;

public interface UserRepository {

    HttpResponse informationUserData(int idUser);

    HttpResponse createUser();

    HttpResponse informationUsersListData(int idPage);

    HttpResponse deleteUser(int idUser);

    HttpResponse updateUser(int idUser);
}
