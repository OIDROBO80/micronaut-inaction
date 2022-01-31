package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
<<<<<<< HEAD
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;

public interface UserRepository {
    DataUser getUserReqres(int idUser);
    DataUsers getUsersListReqres(int idPage);
    Object createUserReqres();
=======

public interface UserRepository {
    DataUser getUserData(int idUser);
    Object createUser();
>>>>>>> SP1_OMNI1_REFACTOR
}
