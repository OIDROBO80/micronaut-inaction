package co.com.bancodebogota.client

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class AccountLimitsClientSpec extends Specification {

    @Inject
    AccountLimitsClient accountLimitsClient


    void 'test health controller'(){
        expect:
        accountLimitsClient.health() == "Healthy OK!"
    }
}
