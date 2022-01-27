package co.com.bancodebogota.context.account.limits.application.create;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.infrastructure.ApiReqres;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Singleton;

@Singleton
public class UsersCreate implements co.com.bancodebogota.context.account.limits.domain.interfaces.UsersCreate {

    private final UserRepository userRepository;

    public UsersCreate(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public HttpResponse run() {
        return userRepository.createUser();
    }
}
