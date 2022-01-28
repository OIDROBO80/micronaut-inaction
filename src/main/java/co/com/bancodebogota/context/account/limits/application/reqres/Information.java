package co.com.bancodebogota.context.account.limits.application.reqres;

import co.com.bancodebogota.client.ReqresClient;
import co.com.bancodebogota.context.account.limits.domain.interfaces.User;
import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import jakarta.inject.Singleton;

@Singleton
public class Information implements User {

    private final UserRepository userRepository;

    public Information(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public Object myselfApi() {
        return userRepository.apiMyself();
    }

    @Override
    public DataUser byId(int idUser) {
        return userRepository.getUserData(idUser);
    }

    @Override
    public DataUsers byPage(int idPage) {
        return userRepository.getUsersListData(idPage);
    }

    @Override
    public Object create() {
        return userRepository.createUserReqres();
    }
}
