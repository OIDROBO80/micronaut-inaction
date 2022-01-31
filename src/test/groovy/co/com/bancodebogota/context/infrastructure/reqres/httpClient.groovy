package co.com.bancodebogota.context.infrastructure.reqres

import io.micronaut.http.client.HttpClient
import io.micronaut.test.annotation.MockBean

@MockBean(HttpClient)
HttpClient httpClient() {
    return Mock(HttpClient)
}
