package co.com.bancodebogota.client

import co.com.bancodebogota.context.account.limits.domain.user.DataUser
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

import java.net.http.HttpResponse


@MicronautTest
class ReqresClientSpec extends Specification {

    @Inject
    ReqresClient reqresClient

    void 'get information User'(){
        when: "get information client"
        def informationUser = reqresClient.informationUserData(idUser)

        then: "the tags id is include"
        informationUser.status().code == 200
        informationUser.getBody().get().data["id"] == expect

        where: "if the idUser is equal the value "
        idUser | expect
        2      | 2
        3      | 3
    }

    /*void 'Validate structure information User'(){
        when: "get information client"
        def informationUser = reqresClient.informationUserData(1)

        then: "The information is the UserDto Class"        informationUser.getBody().get()== DataUser.class
    }*/
}