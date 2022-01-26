package co.com.bancodebogota.client;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client()
public interface HealthClient {


  @Get("/health")
  String health();
}
