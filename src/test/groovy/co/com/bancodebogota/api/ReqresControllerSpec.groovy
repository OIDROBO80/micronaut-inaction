package co.com.bancodebogota.api

import co.com.bancodebogota.context.domain.interfaces.User
import co.com.bancodebogota.context.domain.response.Response
import co.com.bancodebogota.context.domain.user.Data
import co.com.bancodebogota.context.domain.user.DataUser
import co.com.bancodebogota.context.domain.user.Support
import io.micronaut.http.client.HttpClient
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification
import spock.lang.Subject

@MicronautTest
class ReqresControllerSpec extends Specification {

    def byId ()  {
        DataUser dataUser = new DataUser("probe2")
        dataUser.data = new Data()
        dataUser.data.id = 1
        dataUser.response.statusCode = 200
        return dataUser
    }

    @Inject
    User user = Stub(User.class) {
        user.byId(_) >> byId()
    }

    @Subject
    ReqresController reqresController = new ReqresController(user)

    def "should find information User successfully"() {
        when: "An Id number is passed to find information User"
        def resultUser = byId();
        def resultApi = reqresController.getUser(idUser)

        then: "An information user should be returned"
        resultApi.getBody().get().getClass() == resultUser.getClass()
        resultApi.status().code == resultUser.response.statusCode

        where: "to IdUsers"
        idUser = 1
    }

}
