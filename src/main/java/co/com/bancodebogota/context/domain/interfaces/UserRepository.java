package co.com.bancodebogota.context.domain.interfaces;

import co.com.bancodebogota.context.domain.response.Response;
import co.com.bancodebogota.context.domain.user.DataUser;
import co.com.bancodebogota.context.domain.user.DataUsers;

public interface UserRepository {
    // Get User Reqres by id
    DataUser getUserData(int idUser);

    // Get Users List by page
    DataUsers getUsersListData(int idPage);

    // Create user Reqres
    Response createUser();

}
