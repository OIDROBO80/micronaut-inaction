package co.com.bancodebogota.client

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class ReqresClientSpec extends Specification {

    @Inject
    ReqresClient accountLimitsClient


    void 'test health controller'(){
        expect:
        accountLimitsClient.health() == "Healthy OK!"
    }
}
