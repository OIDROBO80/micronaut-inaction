package co.com.bancodebogota.context.account.limits.application.find;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.infrastructure.ApiReqres;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Singleton;

@Singleton
public final class UsersFinder implements co.com.bancodebogota.context.account.limits.domain.interfaces.UsersFinder {

    private final UserRepository userRepository;

    public UsersFinder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public HttpResponse run(int idUser) {
        return userRepository.informationUserData(idUser);
    }
}
