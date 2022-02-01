package co.com.bancodebogota.context.account.limits.infrastructure.reqres;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
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
            switch (data.code()){
                case 404:
                    DataUser dataCase1 = new DataUser(data.reason(),data.code());
                    return dataCase1;
                case 500:
                    DataUser dataCase2 = new DataUser(data.reason(),data.code());
                    return dataCase2;

                case 400:
                    DataUser dataCase3 = new DataUser(data.reason(),data.code());
                    return dataCase3;

                default:
                   DataUser dataUser = new DataUser(data.reason(),data.code());
                   dataUser.data = data.body().data;
                   dataUser.support = data.body().support;
                   return dataUser;
            }
        }catch (HttpClientResponseException e){
            System.out.println(e);
            DataUser dataUser = new DataUser(e.getMessage(),e.getStatus().getCode());
            return dataUser;
        }
    }

    @Override
    public Object createUser() {
        try {
            HttpResponse<Object> data = apiReqres.createUser();
            System.out.println(data.code());
            return data.body();
        }catch (HttpClientResponseException e){
            System.out.println(e.getStatus().getCode());
            System.out.println(e.getMessage());
            DataUser dataUser = new DataUser(e.getMessage(),e.getStatus().getCode());
            return dataUser;
        }

    }

    @Override
    public DataUser getDataMockoon(int idUser) {
        try {
            HttpResponse<DataUser> data = apiReqres.getUserMockoon(idUser);
            switch (data.code()){
                case 404:
                    DataUser dataCase1 = new DataUser(data.reason(),data.code());
                    return dataCase1;
                case 500:
                    DataUser dataCase2 = new DataUser(data.reason(),data.code());
                    return dataCase2;

                case 400:
                    DataUser dataCase3 = new DataUser(data.reason(),data.code());
                    return dataCase3;

                default:
                    DataUser dataUser = new DataUser(data.reason(),data.code());
                    dataUser.data = data.body().data;
                    dataUser.support = data.body().support;
                    return dataUser;
            }
        }catch (HttpClientResponseException e){
            System.out.println(e);
            DataUser dataUser = new DataUser(e.getMessage(),e.getStatus().getCode());
            return dataUser;
        }
    }

}
