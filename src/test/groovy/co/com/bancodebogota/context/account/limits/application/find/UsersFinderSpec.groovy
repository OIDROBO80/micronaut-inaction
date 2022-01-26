package co.com.bancodebogota.context.account.limits.application.find


import co.com.bancodebogota.context.account.limits.domain.user.Data
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import spock.lang.Subject

@MicronautTest
class UsersFinderSpec extends Specification {
    static final Data ACCOUNT_LIMITS_QUERY = new Data()

    APIRegresRepository accountLimitsRepository = Mock()

    @Subject
    UsersFinder accountLimitsFinder = new UsersFinder(accountLimitsRepository)

    def "should find account limits successfully"() {
        given: "An account number"
        accountLimitsRepository.getAccountLimits(_ as String) >> ACCOUNT_LIMITS_QUERY

        when: "An account number is passed to find account limits"
        def result = accountLimitsFinder.run(_ as String)

        then: "An account limits should be returned"
        result == ACCOUNT_LIMITS_QUERY
    }

}
