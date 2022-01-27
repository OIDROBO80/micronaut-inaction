package co.com.bancodebogota.context.account.limits.infrastructure;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import jakarta.inject.Singleton;

@Singleton
public class ApiReqresRepository implements UserRepository {

    private final ApiReqres apiReqres;

    public ApiReqresRepository(ApiReqres apiReqres) {
        this.apiReqres = apiReqres;
    }

    @Override
    public DataUser getUserReqres(int idUser) {
        return apiReqres.getUserData(idUser);
    }

    @Override
    public DataUsers getUsersListReqres(int idPage) {
        return apiReqres.getUsersListData(idPage);
    }

    @Override
    public Object createUserReqres() {
        return apiReqres.createUser();
    }
}
