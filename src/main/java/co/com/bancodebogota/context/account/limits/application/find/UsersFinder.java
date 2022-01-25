package co.com.bancodebogota.context.account.limits.application.find;

import co.com.bancodebogota.context.account.limits.domain.interfaces.APIRegresRepository;
import co.com.bancodebogota.context.account.limits.domain.user.UsersDto;
import jakarta.inject.Singleton;

@Singleton
public final class UsersFinder implements co.com.bancodebogota.context.account.limits.domain.interfaces.UsersFinder {

    private final APIRegresRepository repository;

    private UsersFinder(APIRegresRepository APIRegresRepository) {
        this.repository = APIRegresRepository;
    }
    public UsersDto run(int idUser) {
        return repository.informationUser(idUser);
    }

}
