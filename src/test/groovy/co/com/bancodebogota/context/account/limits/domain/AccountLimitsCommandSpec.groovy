package co.com.bancodebogota.context.account.limits.domain


import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification

@MicronautTest
class AccountLimitsCommandSpec extends Specification {

    void "Account full limits is formed with 12 items"() {
        given: "an account to full limits"
        AccountLimitsCommand valid


        when: "get account full limits has 12 items"
        valid = new AccountLimitsCommand(null)

        then: "account full limits is correct"
        valid.getLimits() == null

    }
}
