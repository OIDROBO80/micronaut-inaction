package co.com.bancodebogota.context.account.limits.domain.user;

import co.com.bancodebogota.context.account.limits.domain.response.Response;
import io.micronaut.core.annotation.Introspected;

@Introspected
public class DataUser{
    public Data data;
    public Support support;
    public Response response = new Response();

    public DataUser(String message) {//
        this.response.message = message;
    }
}
