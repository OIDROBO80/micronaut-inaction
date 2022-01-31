package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.context.account.limits.domain.user.DataUser;
import io.micronaut.http.annotation.PathVariable;

public interface User {
    DataUser byId(@PathVariable("iduser") int idUser);
    Object create();
}