package co.com.bancodebogota.context.account.limits.infrastructure.reqres;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.server.exceptions.HttpStatusHandler;
import io.netty.handler.codec.http.multipart.HttpPostRequestDecoder;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import reactor.core.publisher.Mono;

@Singleton
public class ApiReqresRepository implements UserRepository {

    @Inject
    HttpClient client;

    public final ApiReqres apiReqres;

    public ApiReqresRepository(ApiReqres apiReqres) {
        this.apiReqres = apiReqres;
    }

    @Override
    public DataUser getUserData(int idUser) {
        return apiReqres.getUserById(idUser);
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
