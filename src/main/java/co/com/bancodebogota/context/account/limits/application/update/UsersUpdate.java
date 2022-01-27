package co.com.bancodebogota.context.account.limits.application.update;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.infrastructure.ApiReqres;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Singleton;

@Singleton
public class UsersUpdate implements co.com.bancodebogota.context.account.limits.domain.interfaces.UsersUpdate {

    private final UserRepository userRepository;

    public UsersUpdate(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public HttpResponse run(int idUser) {
        return userRepository.updateUser(idUser);
    }
}
