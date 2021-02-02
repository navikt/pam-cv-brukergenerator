package no.nav.arbeid.pam.pamcvbrukergenerator.dolly

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpHeaders
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient

class DollyClient {
    private val log: Logger = LoggerFactory.getLogger(DollyClient::class.java)

    fun createUser(
            authorization: String,
            query: String,
            limit: String,
            lang: String = "no",
            branch: String = "skill",
            CLASS_ESCO: String = "*",
            output_classifications: String = "ESCO"
    ): String? {
        val client = WebClient
                .builder()
                .baseUrl("REPLACE")
                .defaultHeader(HttpHeaders.AUTHORIZATION, authorization)
                .build()

        return client.get()
                .uri { uriBuilder ->
                    uriBuilder
                            .path("/japi/labels/")
                            .queryParam("q", query)
                            .queryParam("limit", limit)
                            .queryParam("lang", lang)
                            .queryParam("branch", branch)
                            .queryParam("CLASS_ESCO", CLASS_ESCO)
                            .queryParam("output_classifications", output_classifications)
                            .build()
                }
                .retrieve()
                .bodyToMono(String::class.java)
                .block()
    }
}