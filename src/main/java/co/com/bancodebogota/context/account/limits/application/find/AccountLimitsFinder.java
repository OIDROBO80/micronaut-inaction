package co.com.bancodebogota.context.account.limits.application.find;

import co.com.bancodebogota.context.account.limits.domain.AccountLimitsQuery;
import co.com.bancodebogota.context.account.limits.domain.AccountLimitsRepository;
import jakarta.inject.Singleton;

@Singleton
public final class AccountLimitsFinder {

    private final AccountLimitsRepository repository;
    public AccountLimitsFinder(AccountLimitsRepository accountLimitsRepository) {
        this.repository = accountLimitsRepository;
    }
    public AccountLimitsQuery run(String accountId) {
        return repository.getAccountLimits(accountId);
    }

}
