package co.com.bancodebogota.context.account.limits.application.create;

import co.com.bancodebogota.context.account.limits.infrastructure.ApiReqres;
import jakarta.inject.Singleton;

@Singleton
public class UsersCreate implements co.com.bancodebogota.context.account.limits.domain.interfaces.UsersCreate {

    public  final ApiReqres apiReqres;

    public UsersCreate(ApiReqres apiReqres) {
        this.apiReqres = apiReqres;
    }

    @Override
    public Object userCreate() {

        return apiReqres.userCreate();
    }
}
