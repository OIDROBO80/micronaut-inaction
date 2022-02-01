package co.com.bancodebogota.api;


import co.com.bancodebogota.context.account.limits.domain.interfaces.User;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
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


    @Get(value="users/{iduser}")
    public DataUser informationUserData(@PathVariable("iduser") int idUser) {
        return user.byId(idUser);
    }

    @Get(value = "user/{idUser}")
    public DataUser informationMockoon(@PathVariable("idUser")int idUser){
        return user.findById(idUser);
    }


    @Post(value = "users")
    public Object createUser(){
        return user.create();
    }



}
