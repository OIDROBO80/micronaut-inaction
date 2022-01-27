package co.com.bancodebogota.context.account.limits.application.find


import co.com.bancodebogota.context.account.limits.domain.user.Data
import co.com.bancodebogota.context.account.limits.domain.user.DataUser
import co.com.bancodebogota.context.account.limits.infrastructure.ApiReqres
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import spock.lang.Subject

@MicronautTest
class UsersFinderSpec extends Specification {
    static final DataUser dataUser = new DataUser()

    ApiReqres apiReqres = Mock()

    @Subject
    UsersFinder usersFinder = new UsersFinder(apiReqres)

    def "should find account limits successfully"() {
        given: "An information user"
        apiReqres.informationUserData([*_]) >> dataUser

        when: "An id number is passed to find information user"
        def result = usersFinder.informationUserData([*_])

        then: "An information user should be returned"
        result == dataUser

        /*where:
        idUser = 2*/
    }

}
