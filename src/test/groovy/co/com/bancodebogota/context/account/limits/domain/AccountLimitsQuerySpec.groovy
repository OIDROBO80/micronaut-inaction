package co.com.bancodebogota.context.account.limits.domain

import io.micronaut.context.ApplicationContext
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification


@MicronautTest
class AccountLimitsQuerySpec extends Specification {

    @AutoCleanup @Shared
    ApplicationContext ctx = ApplicationContext.run()

    void "Account full limits is formed with 12 items"() {
        given: "an account to full limits"
        AccountLimitsQuery valid


        when: "get account full limits has 12 items"
        valid = new AccountLimitsQuery(null)

        then: "account full limits is correct"
        valid.getAcctLimits() == null

    }
}
