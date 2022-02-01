package co.com.bancodebogota.context.account.limits.domain.user;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;

@Introspected
public class DataUser{
    public Data data;
    public Support support;
    public String message;
    public int statusCode;

    public DataUser(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }
}
