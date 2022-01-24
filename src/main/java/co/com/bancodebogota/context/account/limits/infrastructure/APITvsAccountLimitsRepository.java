package co.com.bancodebogota.context.account.limits.infrastructure;

import co.com.bancodebogota.context.account.limits.domain.AccountLimitsQuery;
import co.com.bancodebogota.context.account.limits.domain.AccountLimitsRepository;
import io.micronaut.context.annotation.Value;

import java.util.ArrayList;

public final class APITvsAccountLimitsRepository  implements AccountLimitsRepository {

    @Value("${apiTvs.account.limits.url}")
    private String endpoint;

    @Override
    public AccountLimitsQuery getAccountLimits(String accountNumber) {
        return new AccountLimitsQuery(new ArrayList<>());
    }

}
