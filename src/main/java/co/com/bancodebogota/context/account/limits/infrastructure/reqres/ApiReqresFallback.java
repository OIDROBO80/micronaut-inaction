package co.com.bancodebogota.context.account.limits.infrastructure.reqres;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.retry.annotation.Fallback;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Mono;

@Fallback
public class ApiReqresFallback implements ApiReqres{

    @Override
    public Object getApiMyself() {
        return new DataUser("Fallback");
    }

    @Override
    public DataUser getUserById(int idUser) {
        return new DataUser("Fallback");
    }

    @Override
    public DataUsers getUsersListByPage(int idPage) {
        return null;
    }

    @Override
    public Object createUser() {
        return null;
    }

}
