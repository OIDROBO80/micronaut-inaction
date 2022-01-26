package co.com.bancodebogota.client

import co.com.bancodebogota.context.account.limits.domain.interfaces.UsersFinder
import co.com.bancodebogota.context.account.limits.domain.user.DataUser
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class ReqresClientSpec extends Specification {

    @Inject
    RegresClient regresClient
    @Inject
    UsersFinder usersFinder

    void 'get information User'(){
        when: "get information client"
        def informationUser = regresClient.informationUserData(idUser)

        then: "the tags id is include"
        informationUser.data.id == expect

        where: "if the idUser is equal the value "
        idUser | expect
        2      | 2
        3      | 3
    }

    void 'Validate structure information User'(){
        when: "get information client"
        def informationUser = regresClient.informationUserData(1)

        then: "The information is the UserDto Class"
        informationUser.getClass() == DataUser.class
    }
}
