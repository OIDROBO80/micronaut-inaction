package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;

public interface UserRepository {
    // Get User Reqres by id
    DataUser getUserData(int idUser);

    // Get Users List by page
    DataUsers getUsersListData(int idPage);

    // Create user Reqres
    Object createUserReqres();

    //prueba
    Object apiMyself();
}
