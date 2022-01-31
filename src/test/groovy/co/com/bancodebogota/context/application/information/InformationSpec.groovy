package co.com.bancodebogota.context.application.information

import co.com.bancodebogota.context.application.Information
import co.com.bancodebogota.context.domain.interfaces.UserRepository
import co.com.bancodebogota.context.domain.user.Data
import co.com.bancodebogota.context.domain.user.DataUser
import io.micronaut.http.client.BlockingHttpClient
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import spock.lang.Subject

@MicronautTest
class InformationSpec extends Specification {

    static final DataUser dataUser = new DataUser("");

    UserRepository userRepository = Mock()


    @Subject
    Information information = new Information(userRepository)

    def "should find information user"() {
        given: "An information user"
        userRepository.getUserData(_) >> dataUser

        when: "An get information by Id"
        def result = information.byId(idUser)

        then: "An information user is resolve"
        result == dataUser

        where: "The idUser is any number"
        idUser << [0,1,2]
    }
}
