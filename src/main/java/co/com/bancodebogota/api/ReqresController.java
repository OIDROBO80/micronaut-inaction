package co.com.bancodebogota.api;


import co.com.bancodebogota.context.account.limits.domain.Utils;
import co.com.bancodebogota.context.account.limits.domain.interfaces.User;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;

@Controller("/api/${api.version:v1}")
public final class ReqresController {

    private final User user;

    public ReqresController(User user) {
        this.user = user;
    }

    @Get(value = "users/apimyself")
    public Object getApiMyself(){
        return user.myselfApi();
    }

    @Get(value="users/{iduser}")
    public HttpResponse<DataUser> GetUser(@PathVariable("iduser") int idUser) {
        return Utils.validateResponse(user.byId(idUser));
    }

    @Get(value = "users/list/{idPage}")
    public DataUsers GetUsersList(@PathVariable("idPage")int idPage){
        return user.byPage(idPage);
    }

   @Post(value = "users")
    public Object createUser(){
        return user.create();
    }


}
