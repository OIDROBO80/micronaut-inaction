package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;

public interface UserRepository {
    DataUser getUserData(int idUser);
    Object createUser();
}
