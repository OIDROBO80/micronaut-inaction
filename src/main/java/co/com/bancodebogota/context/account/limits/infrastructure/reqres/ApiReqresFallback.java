package co.com.bancodebogota.context.account.limits.infrastructure.reqres;


import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.http.HttpResponse;
import io.micronaut.retry.annotation.Fallback;

@Fallback
public class ApiReqresFallback implements ApiReqres{

    @Override
    public HttpResponse<DataUser> getUserById(int idUser) {
        return null;
    }

    @Override
    public HttpResponse<Object> createUser() {
        return null;
    }
}
