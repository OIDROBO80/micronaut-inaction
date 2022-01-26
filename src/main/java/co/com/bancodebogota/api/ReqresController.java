package co.com.bancodebogota.api;


import co.com.bancodebogota.context.account.limits.domain.interfaces.*;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;

@Controller("/api/${api.version:v1}")
public final class ReqresController {


    private final UsersFinder usersFinder;
    private final UsersListFinder usersListFinder;
    private final UsersCreate usersCreate;
    private final UsersUpdate usersUpdate;
    private final UsersDelete usersDelete;

    public ReqresController(UsersFinder usersFinder, UsersListFinder usersListFinder, UsersCreate usersCreate, UsersUpdate usersUpdate, UsersDelete usersDelete) {

        this.usersFinder = usersFinder;
        this.usersListFinder = usersListFinder;
        this.usersCreate = usersCreate;
        this.usersUpdate = usersUpdate;
        this.usersDelete = usersDelete;
    }

    @Get(value="users/{iduser}")
    public HttpResponse informationUserData(@PathVariable("iduser") int idUser) {

        return HttpResponse.ok(usersFinder.informationUserData(idUser));
    }

    @Get(value = "users/list/{idPage}")
    public HttpResponse informationUsersListData(@PathVariable("idPage")int idPage){
        return HttpResponse.ok(usersListFinder.informationUsersListData(idPage));
    }

    @Post(value = "users")
    public HttpResponse createUser(){
        return HttpResponse.created(usersCreate.userCreate());
    }

    @Put("users/{idUser}")
    public HttpResponse updateUser(@PathVariable("idUser") int idUser){

        return HttpResponse.ok(usersUpdate.updateUser(idUser));
    }


    @Delete("users/{idUser}")
    public HttpResponse deleteUser(@PathVariable("idUser") int idUser){
        usersDelete.deleteUser(idUser);
        return HttpResponse.noContent();
    }


}