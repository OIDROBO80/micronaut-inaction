package co.com.bancodebogota.context.account.limits.infrastructure


import co.com.bancodebogota.context.account.limits.domain.AccountLimitsQuery
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification

@MicronautTest
class APITvsAccountLimitsRepositorySpec extends Specification {
    static final  ACCOUNT_NUMBER = "123456789"

    static final  ACCOUNT_LIMIT_RESULT = [
            status: "OK",
            data: [
                accountNumber: ACCOUNT_NUMBER,
                accountType: "C",
                accountLimit: "100000",
                accountBalance: "0"
            ],
            accountLimit: "100000"
    ]

    void "The API TVS response successfully the limits to an account"() {
        given: "A conecction to the API TVS"
        APITvsAccountLimitsRepository accountLimitsRepository = new APITvsAccountLimitsRepository()
        var result = new AccountLimitsQuery(new ArrayList<>())
        when: "I request the limits of an account"
        accountLimitsRepository.getAccountLimits(ACCOUNT_NUMBER) >> result

        then:"I receive the limits of the account"
        accountLimitsRepository.getAccountLimits(ACCOUNT_NUMBER).acctLimits.size() == 0

    }

}
