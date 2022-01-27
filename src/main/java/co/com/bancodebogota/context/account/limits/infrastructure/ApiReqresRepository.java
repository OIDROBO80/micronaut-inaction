package co.com.bancodebogota.context.account.limits.infrastructure;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.context.annotation.Value;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import jakarta.inject.Inject;

public class ApiReqresRepository implements UserRepository {

    @Value("${api.reqres.url}")
    private  String apiReqresUrl;

    @Inject
    @Client("/")
    private HttpClient httpClient;

    public ApiReqresRepository () {
        //nothing
    }

    @Override
    public HttpResponse informationUserData(int idUser) {
        // Reporte en tiempo real del estado (http.status,timer,descripcion,origen,metodo http) de comunicacion http
        HttpResponse dataUser = null;
        String httmsg = httpClient.toBlocking().retrieve(
                HttpRequest.GET("https://reqres.in/api/users/2"));
        return dataUser; }

    @Override
    public HttpResponse createUser() {
        // Reporte en tiempo real del estado (http.status,timer,descripcion,origen,metodo http) de comunicacion http
        HttpResponse httpResponse = null;
        String httmsg = httpClient.toBlocking().retrieve(
                HttpRequest.GET("https://reqres.in/api/users/2"));
        return httpResponse;
    }

    @Override
    public HttpResponse informationUsersListData(int idPage) {
        // Reporte en tiempo real del estado (http.status,timer,descripcion,origen,metodo http) de comunicacion http
        HttpResponse httpResponse = null;
        String httmsg = httpClient.toBlocking().retrieve(
                HttpRequest.GET("https://reqres.in/api/users/2"));
        return httpResponse;
    }

    @Override
    public HttpResponse deleteUser(int idUser) {
        // Reporte en tiempo real del estado (http.status,timer,descripcion,origen,metodo http) de comunicacion http
        HttpResponse httpResponse = null;
        String httmsg = httpClient.toBlocking().retrieve(
                HttpRequest.GET("https://reqres.in/api/users/2"));
        return httpResponse;
    }

    @Override
    public HttpResponse updateUser(int idUser) {
        // Reporte en tiempo real del estado (http.status,timer,descripcion,origen,metodo http) de comunicacion http
        HttpResponse httpResponse = null;
        String httmsg = httpClient.toBlocking().retrieve(
                HttpRequest.GET("https://reqres.in/api/users/2"));
        return httpResponse;
    }

}
