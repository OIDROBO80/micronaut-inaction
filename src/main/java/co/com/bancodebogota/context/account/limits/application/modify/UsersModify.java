package co.com.bancodebogota.context.account.limits.application.modify;

import co.com.bancodebogota.context.account.limits.domain.interfaces.APIRegresRepository;
import jakarta.inject.Singleton;

@Singleton
public final class UsersModify implements co.com.bancodebogota.context.account.limits.domain.interfaces.UsersModify {

    private final APIRegresRepository repository;

    private UsersModify(APIRegresRepository APIRegresRepository) {
        this.repository = APIRegresRepository;
    }

    public void run(int idUser) {
        //
    }

}
