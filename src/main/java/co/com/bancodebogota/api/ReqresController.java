package co.com.bancodebogota.api;


import co.com.bancodebogota.context.account.limits.domain.interfaces.*;
import io.micronaut.http.HttpResponse;

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

        return HttpResponse.ok(usersFinder.run(idUser));
    }

    @Get(value = "users/list/{idPage}")
    public HttpResponse informationUsersListData(@PathVariable("idPage")int idPage){
        return usersListFinder.run(idPage);
    }

    @Post(value = "users")
    public HttpResponse createUser(){
        return usersCreate.run();
    }

    @Put("users/{idUser}")
    public HttpResponse updateUser(@PathVariable("idUser") int idUser){
        return usersUpdate.run(idUser);
    }


    @Delete("users/{idUser}")
    public HttpResponse deleteUser(@PathVariable("idUser") int idUser){
        return this.usersDelete.run(idUser);
    }


}
