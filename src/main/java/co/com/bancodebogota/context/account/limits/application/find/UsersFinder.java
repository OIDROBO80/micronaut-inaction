package co.com.bancodebogota.context.account.limits.application.find;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.infrastructure.ApiReqres;
import jakarta.inject.Singleton;

@Singleton
public final class UsersFinder {

    private final UserRepository userRepository;

    public UsersFinder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /*public DataUser run(int idUser){
        return userRepository.userData(idUser);
    }*/

}
