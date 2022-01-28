package co.com.bancodebogota.api;


import co.com.bancodebogota.context.account.limits.application.find.UsersFinder;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller("/api/${api.version:v1}")
public final class ReqresController {

    private final UsersFinder usersFinder;

    public ReqresController(UsersFinder usersFinder) {
        this.usersFinder = usersFinder;
    }

    @Get(value="users/{iduser}")
    public DataUser findUserById(@PathVariable("iduser") int idUser) {
        return usersFinder.run(idUser);
    }


}
