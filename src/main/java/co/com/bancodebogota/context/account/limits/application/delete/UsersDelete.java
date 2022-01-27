package co.com.bancodebogota.context.account.limits.application.delete;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.infrastructure.ApiReqres;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Singleton;

@Singleton
public class UsersDelete implements co.com.bancodebogota.context.account.limits.domain.interfaces.UsersDelete {

    private final UserRepository userRepository;

    public UsersDelete(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public HttpResponse run(int idUser) {
        return userRepository.deleteUser(idUser);
    }
}
