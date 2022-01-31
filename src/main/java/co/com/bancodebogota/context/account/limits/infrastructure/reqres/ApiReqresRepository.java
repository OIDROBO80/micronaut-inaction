package co.com.bancodebogota.context.account.limits.infrastructure.reqres;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.client.HttpClient;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class ApiReqresRepository implements UserRepository {

    @Inject
    HttpClient client;

    public final ApiReqres apiReqres;

    public ApiReqresRepository(ApiReqres apiReqres) {
        this.apiReqres = apiReqres;
    }

    @Override()
    public DataUser getUserData(int idUser) {
        HttpResponse<DataUser> data = apiReqres.getUserById(idUser);
        System.out.println(data.code());
        return data.body();
    }

    @Override
    public Object createUser() {
        HttpResponse<Object> data = apiReqres.createUser();
        System.out.println(data.code());
        return data.body();
    }

}
