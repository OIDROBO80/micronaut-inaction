package co.com.bancodebogota.api;

import co.com.bancodebogota.context.account.limits.domain.user.UsersDto;
import io.micronaut.http.annotation.*;

@Controller("/users")
public final class ReqresController {

    @Get(value="/{iduser}")
    public UsersDto informationUser(@PathVariable("iduser") int idUser) {

        return new UsersDto() ;
    }

    @Put(value="/{iduser}")
    public void  updateUser(@PathVariable("iduser") int idUser) {
        //
    }
}
