package co.com.bancodebogota.api;


import co.com.bancodebogota.context.domain.Utils;
import co.com.bancodebogota.context.domain.interfaces.User;
import co.com.bancodebogota.context.domain.response.Response;
import co.com.bancodebogota.context.domain.user.DataUser;
import co.com.bancodebogota.context.domain.user.DataUsers;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/api/${api.version:v1}")
public final class ReqresController {
    @Inject
    private User user;

    public ReqresController(User user) {
        this.user = user;
    }

    @Get(value="users/{iduser}")
    public HttpResponse<DataUser> getUser(@PathVariable("iduser") int idUser) {
        DataUser dataUser = user.byId(idUser);
        return Utils.validateDataUser(dataUser);
    }

    @Get(value = "users/list/{idPage}")
    public HttpResponse<DataUsers>  getUsersList(@PathVariable("idPage")int idPage){
        return Utils.validateDataUsers(user.byPage(idPage));
    }

   @Post(value = "users")
    public HttpResponse<Response> createUser(){
        return Utils.validateResponse(user.create());
    }


}
