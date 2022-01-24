package co.com.bancodebogota.context.account.limits.domain;

import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Introspected
public final class AccountLimits {

    @NotBlank
    private String username;

    @Size(min = 8)
    private String password;


    public AccountLimits(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
