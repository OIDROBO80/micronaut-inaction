package co.com.bancodebogota.context.infrastructure.reqres


import co.com.bancodebogota.context.domain.user.DataUser
import co.com.bancodebogota.context.domain.user.DataUsers
import io.micronaut.context.annotation.Property
import io.micronaut.core.type.Argument
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.client.BlockingHttpClient
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification
import spock.lang.Subject

@MicronautTest(environments = ["test"])
class ApiReqresRepositorySpec extends Specification{

    static final DataUser dataUser = new DataUser("PRUEBADATAUSER");

    BlockingHttpClient blockingHttpClient = Mock(BlockingHttpClient.class) {
        retrieve(_ as String, DataUser.class) >> dataUser
    }

    @Inject
    @Client("/")
    HttpClient client = Mock(HttpClient.class)  {
        toBlocking() >> blockingHttpClient
    }

    @Property(name="api.regres.url")
    private String apiRegresUrl;

    @Subject
    ApiReqresRepository apiReqresRepository = new ApiReqresRepository(client)


    @Property(name="api.regres.url", value = "value url api")
    def "should use apiRegresUrl"() {
        expect:
        apiRegresUrl == "value url api"
    }

    @Property(name="api.regres.url", value = "value url api")
    def "should return information user by Id"() {
        when: "An get information by Id"
        def result = apiReqresRepository.getUserData(idUser)

        then: "An information user is resolve"
        result == dataUser

        where: "The idUser is any number"
        idUser << [1,2,3]
    }
}

