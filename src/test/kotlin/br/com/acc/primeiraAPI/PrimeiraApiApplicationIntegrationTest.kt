package br.com.acc.primeiraAPI

import br.com.acc.primeiraAPI.model.HelloDTO
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.MediaType
import org.springframework.test.util.AssertionErrors.assertEquals

@SpringBootTest(
    classes = arrayOf(PrimeiraApiApplication::class),
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
internal class PrimeiraApiApplicationIntegrationTest {


    @Autowired
    lateinit var testRestTemplate : TestRestTemplate

    @Test
    fun quandoChamado_deveRetornarHelloWorld() {
        val result = testRestTemplate.getForEntity("/hello", String::class.java)
        assertEquals("deve retornar hello world", "hello world", result.body)
    }

    @Test
    fun quandoChamado_deveRetornarHelloService() {
        val result = testRestTemplate.getForEntity("/hello-service", String::class.java)
        assertEquals("deve retornar Hello service","Hello service", result.body)
    }

    @Test
    fun quandoChamado_deveRetornarJson() {
        val result = testRestTemplate.getForEntity("/hello-dto", HelloDTO::class.java)
        assertEquals("deve retornar JSON", MediaType.APPLICATION_JSON, result.headers.contentType)
    }
}