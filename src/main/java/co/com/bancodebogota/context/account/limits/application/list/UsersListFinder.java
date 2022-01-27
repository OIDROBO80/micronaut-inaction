package co.com.bancodebogota.context.account.limits.application.list;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import co.com.bancodebogota.context.account.limits.infrastructure.ApiReqres;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Singleton;

@Singleton
public class UsersListFinder implements co.com.bancodebogota.context.account.limits.domain.interfaces.UsersListFinder {

    private final UserRepository userRepository;

    public UsersListFinder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public HttpResponse run(int idPage) {
        return userRepository.informationUsersListData(idPage);
    }
}
