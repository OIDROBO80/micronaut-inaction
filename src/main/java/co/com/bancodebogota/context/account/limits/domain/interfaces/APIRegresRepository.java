package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.context.account.limits.domain.user.UsersDto;

public interface APIRegresRepository {

    UsersDto informationUser(int idUser);

    void updateUser(int idUser);
}
