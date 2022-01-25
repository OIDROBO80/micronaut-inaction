package co.com.bancodebogota.api;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/check")
public final class HealthController {
    @Get("/health")
    public String  health() {
        return "Healthy OK!";
    }
}
