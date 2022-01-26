package co.com.bancodebogota.context.account.limits.application.delete;

import co.com.bancodebogota.context.account.limits.infrastructure.ApiReqres;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Singleton;

@Singleton
public class UsersDelete implements co.com.bancodebogota.context.account.limits.domain.interfaces.UsersDelete {

    private final ApiReqres apiReqres;

    public UsersDelete(ApiReqres apiReqres) {
        this.apiReqres = apiReqres;
    }

    @Override
    public void deleteUser(int idUser) {
        apiReqres.deleteUser(idUser);
    }
}
