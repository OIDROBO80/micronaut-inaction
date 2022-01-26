package co.com.bancodebogota.api;


import co.com.bancodebogota.context.account.limits.domain.interfaces.UsersCreate;
import co.com.bancodebogota.context.account.limits.domain.interfaces.UsersFinder;
import co.com.bancodebogota.context.account.limits.domain.interfaces.UsersListFinder;
import co.com.bancodebogota.context.account.limits.domain.interfaces.UsersUpdate;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import io.micronaut.http.annotation.*;

@Controller("/api/${api.version:v1}")
public final class ReqresController {


    private final UsersFinder usersFinder;
    private final UsersListFinder usersListFinder;
    private final UsersCreate usersCreate;
    private final UsersUpdate usersUpdate;

    public ReqresController(UsersFinder usersFinder, UsersListFinder usersListFinder, UsersCreate usersCreate, UsersUpdate usersUpdate) {

        this.usersFinder = usersFinder;
        this.usersListFinder = usersListFinder;
        this.usersCreate = usersCreate;
        this.usersUpdate = usersUpdate;
    }

    @Get(value="users/{iduser}")
    public DataUser informationUserData(@PathVariable("iduser") int idUser) {

        return usersFinder.informationUserData(idUser);
    }

    @Get(value = "users/list/{idPage}")
    public DataUsers informationUsersListData(@PathVariable("idPage")int idPage){
        return usersListFinder.informationUsersListData(idPage);
    }

    @Post(value = "users")
    public Object createUser(){
        return usersCreate.userCreate();
    }

    @Put("users/{iduser}")
    public Object updateUser(@PathVariable("iduser") int idUser){
        return usersUpdate.updateUser(idUser);
    }


}
