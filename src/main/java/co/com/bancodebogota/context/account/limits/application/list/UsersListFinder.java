package co.com.bancodebogota.context.account.limits.application.list;

import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import co.com.bancodebogota.context.account.limits.infrastructure.ApiReqres;
import jakarta.inject.Singleton;

@Singleton
public class UsersListFinder implements co.com.bancodebogota.context.account.limits.domain.interfaces.UsersListFinder {

    private final ApiReqres apiReqres;

    public UsersListFinder(ApiReqres apiReqres) {
        this.apiReqres = apiReqres;
    }

    @Override
    public DataUsers informationUsersListData(int idPage) {
        return apiReqres.informationUsersListData(idPage);
    }
}
