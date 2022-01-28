package co.com.bancodebogota.context.infrastructure.reqres;

import co.com.bancodebogota.context.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.domain.response.Response;
import co.com.bancodebogota.context.domain.user.DataUser;
import co.com.bancodebogota.context.domain.user.DataUsers;
import io.micronaut.context.annotation.Value;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.http.uri.UriBuilder;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import static io.micronaut.http.HttpRequest.GET;

@Singleton
public class ApiReqresRepository implements UserRepository {

    @Inject
    HttpClient client;

    @Value("${api.regres.url}")
    private String apiRegresUrl;

    private final String getUser ="/users/";

    public final ApiReqres apiReqres;


    public ApiReqresRepository(ApiReqres apiReqres) {
        this.apiReqres = apiReqres;
    }

    @Override
    public DataUser getUserData(int idUser) {
        DataUser dataUser =  new DataUser("");
        Response response = new Response();
        String URL = UriBuilder.of(apiRegresUrl+getUser+idUser).toString();
        try {
            dataUser = client.toBlocking().retrieve(URL,DataUser.class);
            response.statusCode = HttpStatus.OK.getCode();
        } catch (HttpClientResponseException e){
            response.message  = e.getMessage();
            response.statusCode = e.getStatus().getCode();
        }
        dataUser.response = response;
        return dataUser;

    }

    @Override
    public DataUsers getUsersListData(int idPage) {
        return apiReqres.getUsersListByPage(idPage);
    }

    @Override
    public Object createUserReqres() {
        return apiReqres.createUser();
    }

    @Override
   public Object apiMyself(){
        Object object = apiReqres.getApiMyself();
        System.out.println(object);
        return object;
    }
}
