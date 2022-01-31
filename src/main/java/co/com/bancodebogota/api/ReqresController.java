package co.com.bancodebogota.api;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;

@Controller("/api/${api.version:v1}")
public final class ReqresController {

    private final UserRepository userRepository;

    public ReqresController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Get(value="users/{iduser}")
    public DataUser GetUser(@PathVariable("iduser") int idUser) {
        return userRepository.getUserData(idUser);
    }

    @Post(value = "users/create")
    public Object CreateUser(){
        return userRepository.createUser();
    }

}
