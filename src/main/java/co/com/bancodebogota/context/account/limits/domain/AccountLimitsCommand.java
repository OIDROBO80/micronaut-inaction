package co.com.bancodebogota.context.account.limits.domain;

import java.util.List;

public final class AccountLimitsCommand {
  private final List<AccountLimits> limits;

    public AccountLimitsCommand(List<AccountLimits> limits) {
        this.limits = limits;
    }

    public List<AccountLimits> getLimits() {
        return limits;
    }
}
