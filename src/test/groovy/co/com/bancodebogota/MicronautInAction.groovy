package co.com.bancodebogota

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

@MicronautTest
class Micronaut_InActionSpec extends Specification {

    @Shared
    @AutoCleanup
    EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)

    @Inject
    EmbeddedServer server //refers to the server that was started up for this test suite

    @Inject
    ApplicationContext context

    void 'test it works'() {
        expect:
        embeddedServer.running
    }
    void 'test it works application'() {
        expect:
        Application.main(new String[] {})
    }

}
