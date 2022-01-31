package co.com.bancodebogota.context.account.limits.application.data;

import co.com.bancodebogota.client.ReqresClient;
import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import jakarta.inject.Singleton;

@Singleton
public class Information implements ReqresClient {

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

}
