package co.com.bancodebogota.context.account.limits.infrastructure.reqres;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.domain.user.Data;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
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
        try {
            HttpResponse<DataUser> data = apiReqres.getUserById(idUser);
            System.out.println(data.code());
            return data.body();
        }catch (HttpClientResponseException exception){
            System.out.println(exception.getStatus().getCode());
            System.out.println(exception.getMessage());
            DataUser dataUser = new DataUser(exception.getMessage());
            return dataUser;
        }
    }

    @Override
    public Object createUser() {
        try {
            HttpResponse<Object> data = apiReqres.createUser();
            System.out.println(data.code());
            return data.body();
        }catch (HttpClientResponseException exception){
            System.out.println(exception.getStatus().getCode());
            System.out.println(exception.getMessage());
            DataUser dataUser = new DataUser(exception.getMessage());
            return dataUser;
        }

    }

}
