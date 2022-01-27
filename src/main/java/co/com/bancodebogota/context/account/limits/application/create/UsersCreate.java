package co.com.bancodebogota.context.account.limits.application.create;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import jakarta.inject.Singleton;

@Singleton
public class UsersCreate {

    public  final UserRepository userRepository;

    public UsersCreate(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Object run() {
        return userRepository.createUserReqres();
    }
}
