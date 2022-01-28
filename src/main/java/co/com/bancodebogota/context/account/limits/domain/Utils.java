package co.com.bancodebogota.context.account.limits.domain;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;

public class Utils {

    public  static HttpResponse<DataUser> validateResponse(DataUser dataUser) {
        return  HttpResponse.status(HttpStatus.valueOf(dataUser.response.statusCode)).body(dataUser);
    }
}
