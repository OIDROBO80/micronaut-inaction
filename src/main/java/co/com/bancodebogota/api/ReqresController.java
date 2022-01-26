package co.com.bancodebogota.api;

import co.com.bancodebogota.context.account.limits.application.create.UsersCreate;
import co.com.bancodebogota.context.account.limits.domain.interfaces.UsersFinder;
import co.com.bancodebogota.context.account.limits.domain.interfaces.UsersListFinder;
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
    public DataUser informationUserData(@PathVariable("iduser") int idUser) {

        return usersFinder.informationUserData(idUser);
    }

    @Get(value = "users/list/{idUsers}")
    public DataUsers informationUsersListData(@PathVariable("idUsers")int idUsers){
        return usersListFinder.informationUsersListData(idUsers);
    }

    @Post(value = "users")
    public Object createUser(){
        return usersCreate.userCreate();
    }


}
