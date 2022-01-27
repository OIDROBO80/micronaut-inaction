package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;

public interface UserRepository {
    DataUser getUserReqres(int idUser);
    DataUsers getUsersListReqres(int idPage);
    Object createUserReqres();
}
