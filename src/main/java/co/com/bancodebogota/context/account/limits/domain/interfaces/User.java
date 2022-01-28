package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;

public interface User {
    Object myselfApi();
    DataUser byId(int idUser);
    DataUsers byPage(int idPage);
    Object create();
}
