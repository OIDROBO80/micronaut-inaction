package co.com.bancodebogota.client

import co.com.bancodebogota.context.account.limits.domain.user.UsersDto
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class RegresClientSpec extends Specification {

    @Inject
    RegresClient regresClient

    void 'get information User'(){
        when: "get information client"
        def informationUser = regresClient.informationUser(idUser)

        then: "the tags pags is include"
        informationUser.page == expect

        where: "if the idUser is equal the value "
        idUser | expect
        1      | 0
    }

    void 'Validate structure information User'(){
        when: "get information client"
        def informationUser = regresClient.informationUser(1)

        then: "The information is the UserDto Class"
        informationUser.getClass() == UsersDto.class
    }
}
