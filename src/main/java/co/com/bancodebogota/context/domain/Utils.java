package co.com.bancodebogota.context.domain;

import co.com.bancodebogota.context.domain.response.Response;
import co.com.bancodebogota.context.domain.user.DataUser;
import co.com.bancodebogota.context.domain.user.DataUsers;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;

public class Utils {

    public  static HttpResponse<DataUser> validateDataUser(DataUser dataUser) {
        return  HttpResponse.status(HttpStatus.valueOf(dataUser.response.statusCode)).body(dataUser);
    }
    public  static HttpResponse<DataUsers> validateDataUsers(DataUsers dataUsers) {
        return  HttpResponse.status(HttpStatus.valueOf(dataUsers.response.statusCode)).body(dataUsers);
    }

    public  static HttpResponse<Response> validateResponse(Response response) {
        return  HttpResponse.status(HttpStatus.valueOf(response.statusCode)).body(response);
    }
}
