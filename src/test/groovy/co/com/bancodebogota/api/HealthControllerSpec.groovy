package co.com.bancodebogota.api

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import spock.lang.Subject

@MicronautTest
class HealthControllerSpec extends Specification {
    @Subject
    HealthController healthController = new HealthController()

    def "should check successfully"() {
        expect: "Healthy OK!"
        healthController.health() == "Healthy OK!"
    }
}
