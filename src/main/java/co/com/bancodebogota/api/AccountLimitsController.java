package co.com.bancodebogota.api;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/accountlimits")
public final class AccountLimitsController {
    @Get("/health   ")
    public String  health() {
        return "Healthy OK!";
    }
}
