package co.com.bancodebogota.context.account.limits.domain;

public interface AccountLimitsRepository {

    AccountLimitsQuery getAccountLimits(String accountNumber);
}
