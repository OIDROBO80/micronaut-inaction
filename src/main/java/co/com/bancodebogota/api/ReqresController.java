package co.com.bancodebogota.api;


import co.com.bancodebogota.context.account.limits.application.create.UsersCreate;
import co.com.bancodebogota.context.account.limits.application.find.UsersFinder;
import co.com.bancodebogota.context.account.limits.application.list.UsersListFinder;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;

import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.http.annotation.*;

@Controller("/api/${api.version:v1}")
public final class ReqresController {


    private final UsersFinder usersFinder;
    private final UsersListFinder usersListFinder;
    private final UsersCreate usersCreate;


    public ReqresController(UsersFinder usersFinder, UsersListFinder usersListFinder, UsersCreate usersCreate) {
        this.usersFinder = usersFinder;
        this.usersListFinder = usersListFinder;
        this.usersCreate = usersCreate;

    }

    @Get(value="users/{iduser}")
    public DataUser findUserById(@PathVariable("iduser") int idUser) {

        return usersFinder.run(idUser);
    }

    @Get(value = "users/list/{idPage}")
    public DataUsers findUsersListByPage(@PathVariable("idPage")int idPage){
        return usersListFinder.run(idPage);
    }

    @Post(value = "users")
    public Object createUser(){
        return usersCreate.run();
    }


}
