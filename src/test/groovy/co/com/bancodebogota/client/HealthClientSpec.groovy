package co.com.bancodebogota.client

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class HealthClientSpec extends Specification {

    @Inject
    HealthClient healthClient


    void 'test health controller'(){
        expect:
        healthClient.health() == "Healthy OK!"
    }
}
