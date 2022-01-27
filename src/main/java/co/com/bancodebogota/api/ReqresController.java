package co.com.bancodebogota.api;


import co.com.bancodebogota.context.account.limits.application.find.UsersFinder;
import co.com.bancodebogota.context.account.limits.application.list.UsersListFinder;
import co.com.bancodebogota.context.account.limits.application.reqres.DataReqres;
import co.com.bancodebogota.context.account.limits.domain.interfaces.*;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.http.HttpResponse;

import io.micronaut.http.annotation.*;

@Controller("/api/${api.version:v1}")
public final class ReqresController {



    private final DataReqres dataReqres;
    //Llamado a la clase de aplicacion del caso de uso
    /*private final UsersFinder usersFinder;
    private final UsersListFinder usersListFinder;
    private final UsersCreate usersCreate;*/

    /*
    private final UsersUpdate usersUpdate;
    private final UsersDelete usersDelete;*/


    public ReqresController(DataReqres dataReqres, UsersFinder usersFinder, UsersListFinder usersListFinder, UsersCreate usersCreate) {

        this.dataReqres = dataReqres;

        /*this.usersFinder = usersFinder;
        this.usersListFinder = usersListFinder;
        this.usersCreate = usersCreate;*/
        /*
        this.usersUpdate = usersUpdate;
        this.usersDelete = usersDelete;*/
    }

    @Get(value="users/{iduser}")
    public DataUser GetUser(@PathVariable("iduser") int idUser) {
        return dataReqres.byId(idUser);
    }

    @Get(value = "users/list/{idPage}")
    public DataUsers GetUsersList(@PathVariable("idPage")int idPage){
        return dataReqres.byPage(idPage);
    }

   @Post(value = "users")
    public Object createUser(){
        return dataReqres.create();
    }

    /*@Put("users/{idUser}")
    public HttpResponse updateUser(@PathVariable("idUser") int idUser){

        return HttpResponse.ok(usersUpdate.updateUser(idUser));
    }


    @Delete("users/{idUser}")
    public HttpResponse deleteUser(@PathVariable("idUser") int idUser){
        usersDelete.deleteUser(idUser);
        return HttpResponse.noContent();
    }*/


}
