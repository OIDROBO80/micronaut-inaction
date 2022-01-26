package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.client.RegresClient;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.Root;

public interface UsersFinder{
    DataUser informationUserData(int idUser);
}
