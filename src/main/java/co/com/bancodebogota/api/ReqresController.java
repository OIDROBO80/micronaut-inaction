package co.com.bancodebogota.api;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UsersFinder;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Put;

@Controller("/api/${api.version:v1}")
public final class ReqresController {


    private final UsersFinder usersFinder;

    public ReqresController(UsersFinder usersFinder) {

        this.usersFinder = usersFinder;
    }

    @Get(value="users/{iduser}")
    public DataUser informationUserData(@PathVariable("iduser") int idUser) {

        return usersFinder.informationUserData(idUser);
    }

    @Put(value="/{iduser}")
    public void  updateUser(@PathVariable("iduser") int idUser) {
        //
    }
}
