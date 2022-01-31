package co.com.bancodebogota.context.application;

import co.com.bancodebogota.context.domain.interfaces.User;
import co.com.bancodebogota.context.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.domain.user.DataUser;
import co.com.bancodebogota.context.domain.user.DataUsers;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class Information implements User {

    @Inject
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
