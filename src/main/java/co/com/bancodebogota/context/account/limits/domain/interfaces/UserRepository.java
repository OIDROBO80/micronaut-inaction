package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.http.HttpResponse;

public interface UserRepository {
    DataUser getUserData(int idUser);
    Object createUser();
    DataUser getDataMockoon(int idUser);
}
