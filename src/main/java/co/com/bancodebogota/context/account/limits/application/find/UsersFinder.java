package co.com.bancodebogota.context.account.limits.application.find;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.infrastructure.ApiReqres;
import jakarta.inject.Singleton;

@Singleton
public final class UsersFinder implements co.com.bancodebogota.context.account.limits.domain.interfaces.UsersFinder {

    private final ApiReqres apiReqres;

    public UsersFinder(ApiReqres apiReqres) {
        this.apiReqres = apiReqres;
    }

    public DataUser informationUserData(int idUser) {

        return apiReqres.informationUserData(idUser);
    }
}
