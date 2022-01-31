package co.com.bancodebogota.context.infrastructure.reqres

import co.com.bancodebogota.context.domain.user.Data
import co.com.bancodebogota.context.domain.user.DataUser
import co.com.bancodebogota.context.domain.user.DataUsers
import io.micronaut.context.annotation.Property
import io.micronaut.core.convert.DefaultConversionService
import io.micronaut.core.convert.value.MutableConvertibleValues
import io.micronaut.core.type.Argument
import io.micronaut.http.HttpHeaders
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpResponseFactory
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.BlockingHttpClient
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.http.client.exceptions.HttpClientException
import io.micronaut.http.client.exceptions.HttpClientResponseException
import io.micronaut.http.client.netty.FullNettyClientHttpResponse
import io.micronaut.http.codec.MediaTypeCodecRegistry
import io.micronaut.http.netty.NettyMutableHttpResponse
import io.micronaut.http.netty.stream.EmptyHttpResponse
import io.micronaut.http.simple.SimpleHttpResponse
import io.micronaut.http.simple.SimpleHttpResponseFactory
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import io.netty.handler.codec.http.FullHttpResponse
import io.netty.handler.codec.http.HttpResponseStatus
import io.netty.handler.codec.http.HttpVersion
import jakarta.inject.Inject
import spock.lang.Specification
import spock.lang.Subject

import java.util.logging.Handler

@MicronautTest
class ApiReqresRepositorySpec extends Specification{

    private DataUser dataUser ;

    BlockingHttpClient blockingHttpClient = Stub(BlockingHttpClient.class)
    HttpResponse  httpResponse = Stub(HttpResponse.class)

    @Inject
    @Client("/")
    HttpClient client = Stub(HttpClient.class)  {
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
        given: " a response in call a api"
        dataUser = new DataUser("Date Probe")
        Data data = new Data();
        data.id = idUser
        dataUser.data = data
        blockingHttpClient.retrieve(_ as String, DataUser.class) >> dataUser

        when: "a get information by Id is requested"
        def result = apiReqresRepository.getUserData(idUser)

        then: "The information user is resolve"
        result == dataUser

        where: "The idUser is any number"
        idUser << [1,2,3]
    }

    def "should fail information user by Id when fail status code"() {
        given: " a fail response in call a api"
        dataUser = new DataUser("Date Probe")
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST
        httpResponse = new SimpleHttpResponse();
        httpResponse.body(dataUser);
        httpResponse.status(httpStatus)
        blockingHttpClient.retrieve(_ as String, DataUser.class) >> { throw new HttpClientResponseException(httpStatus.getReason(),httpResponse) }

        when: "a get information by Id is requested"
        def result = apiReqresRepository.getUserData(idUser)

        then: "The information user is resolve"
        result.response.statusCode == httpStatus.code
        result.response.message == httpStatus.getReason()

        where: "The idUser is any number"
        idUser << [1]
    }
}

