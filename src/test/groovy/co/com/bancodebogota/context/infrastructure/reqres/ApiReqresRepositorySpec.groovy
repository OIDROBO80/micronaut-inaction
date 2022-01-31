package co.com.bancodebogota.context.infrastructure.reqres

import co.com.bancodebogota.context.application.Information
import co.com.bancodebogota.context.domain.interfaces.UserRepository
import co.com.bancodebogota.context.domain.user.DataUser
import io.micronaut.context.annotation.Any
import io.micronaut.context.annotation.Property
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.annotation.MockBean
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification
import spock.lang.Subject

@MicronautTest
@Property(name="{api.regres.url}", value = "valueurlapi")
class ApiReqresRepositorySpec extends Specification{

    static final DataUser dataUser = new DataUser("");

    @Inject
    @Client("/")
    HttpClient client;

    @Subject
    ApiReqresRepository apiReqresRepository = new ApiReqresRepository(client)

    def "should return information user by Id"() {
        given: "An information user"
        client.toBlocking().retrieve(_ as String,String) >> dataUser

        when: "An get information by Id"
        def result = apiReqresRepository.getUserData(idUser)

        then: "An information user is resolve"
        result == dataUser

        where: "The idUser is any number"
        idUser << [0]
    }
}

