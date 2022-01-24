package co.com.bancodebogota.context.account.limits.domain

import io.micronaut.context.ApplicationContext
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

import javax.validation.Validator

@MicronautTest
class AccountLimitsSpec extends Specification {

    @AutoCleanup @Shared
    ApplicationContext ctx = ApplicationContext.run()
    @Shared
    Validator validator = ctx.getBean(Validator)

    def "GetText"() {
    }

    def "SetText"() {
    }

    void "message full text is formed from text"() {
        given: "a message with example text value"
        AccountLimits valid
        AccountLimits notValid


        when: "we ask for the full text of the message"
        valid = new AccountLimits("test","password")
        notValid = new AccountLimits("test","12")

        then: "we get text"
        validator.validate(valid).isEmpty()
        !validator.validate(notValid).isEmpty()
    }
}
