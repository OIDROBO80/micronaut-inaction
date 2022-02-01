package co.com.bancodebogota.context.domain.interfaces;

import co.com.bancodebogota.context.domain.response.Response;
import co.com.bancodebogota.context.domain.user.DataUser;
import co.com.bancodebogota.context.domain.user.DataUsers;

public interface User {
    DataUser byId(int idUser);
    DataUsers byPage(int idPage);
    Response create();
}
