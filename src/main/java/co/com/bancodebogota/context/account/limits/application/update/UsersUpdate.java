package co.com.bancodebogota.context.account.limits.application.update;

import co.com.bancodebogota.context.account.limits.infrastructure.ApiReqres;
import jakarta.inject.Singleton;

@Singleton
public class UsersUpdate implements co.com.bancodebogota.context.account.limits.domain.interfaces.UsersUpdate {

    public final ApiReqres apiReqres;

    public UsersUpdate(ApiReqres apiReqres) {
        this.apiReqres = apiReqres;
    }

    @Override
    public Object updateUser(int idUser) {
        return apiReqres.updateUser(idUser);
    }
}
