package co.com.bancodebogota.api

import co.com.bancodebogota.context.account.limits.domain.interfaces.UsersFinder
import co.com.bancodebogota.context.account.limits.domain.user.Data
import co.com.bancodebogota.context.account.limits.domain.user.DataUser
import co.com.bancodebogota.context.account.limits.domain.user.Support
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import spock.lang.Subject

@MicronautTest
class ReqresControllerSpec extends Specification{
    final DataUser dataUser = new DataUser()
    final Data data= new Data()
    final Support support= new Support()

    UsersFinder usersFinder = Mock()

    @Subject
    ReqresController reqresController = new ReqresController(usersFinder)

    def "should find information User successfully"() {
        when: "An Id number is passed to find information User"
        def result = reqresController.informationUserData(idUser)

        then: "An information user should be returned"
        usersFinder.informationUserData(_) >> dataUser
        result == dataUser

        where: "to IdUsers"
        idUser << [1, 2, 3]

    }

}
