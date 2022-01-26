package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;

public interface UsersFinder{
    DataUser informationUserData(int idUser);
}
