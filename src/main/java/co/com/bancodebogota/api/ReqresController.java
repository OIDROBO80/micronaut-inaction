package co.com.bancodebogota.api;


import co.com.bancodebogota.context.account.limits.application.reqres.DataReqres;
import co.com.bancodebogota.context.account.limits.domain.Utils;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;

@Controller("/api/${api.version:v1}")
public final class ReqresController {

    private final DataReqres dataReqres;

    public ReqresController(DataReqres dataReqres) {

        this.dataReqres = dataReqres;

    }

    @Get(value = "users/apimyself")
    public Object getApiMyself(){
        return dataReqres.myselfApi();
    }

    @Get(value="users/{iduser}")
    public HttpResponse GetUser(@PathVariable("iduser") int idUser) {
        return Utils.validateResponse(dataReqres.byId(idUser));
    }

    @Get(value = "users/list/{idPage}")
    public DataUsers GetUsersList(@PathVariable("idPage")int idPage){
        return dataReqres.byPage(idPage);
    }

   @Post(value = "users")
    public Object createUser(){
        return dataReqres.create();
    }


}
