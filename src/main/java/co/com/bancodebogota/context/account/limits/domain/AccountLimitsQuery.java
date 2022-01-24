package co.com.bancodebogota.context.account.limits.domain;

import java.util.List;

public final class AccountLimitsQuery {
    private final List<AccountLimits> acctLimits;

    public AccountLimitsQuery(List<AccountLimits> acctLimits) {
        this.acctLimits = acctLimits;
    }

    public List<AccountLimits> getAcctLimits() {
        return acctLimits;
    }
}
