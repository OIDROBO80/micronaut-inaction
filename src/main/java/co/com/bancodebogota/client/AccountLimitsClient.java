package co.com.bancodebogota.client;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("/accountlimits")
public interface AccountLimitsClient {
    @Get("/health")
    String health();
}
