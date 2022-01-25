package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.context.account.limits.domain.user.UserDto;
import co.com.bancodebogota.context.account.limits.domain.user.UsersDto;

public interface UsersFinder {

    UsersDto run(int idUser);
}
