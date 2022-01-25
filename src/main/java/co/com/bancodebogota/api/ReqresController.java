package co.com.bancodebogota.api;

import io.micronaut.http.annotation.*;

@Controller("/users")
public final class ReqresController {
    @Get(value="/{iduser}")
    public String  informationUser(@PathVariable("iduser") int idUser) {
        return "Healthy OK!";
    }

    @Put(value="/{iduser}")
    public void  updateUser(@PathVariable("iduser") int idUser) {
        //
    }
}
