package co.com.bancodebogota.context.account.limits.application.data;

import co.com.bancodebogota.client.ReqresClient;
import co.com.bancodebogota.context.account.limits.domain.interfaces.User;
import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Singleton;

@Singleton
public class Information implements User {

    private final UserRepository userRepository;

    public Information(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public DataUser byId(int idUser) {

        return userRepository.getUserData(idUser);
    }

    @Override
    public Object create() {
        return userRepository.createUser();
    }

    @Override
    public DataUser findById(int idUser) {
        return userRepository.getDataMockoon(idUser);
    }
}
