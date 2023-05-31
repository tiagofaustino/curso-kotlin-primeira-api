package br.com.acc.primeiraAPI

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@SpringBootTest
@AutoConfigureMockMvc
internal class PrimeiraApiApplicationIntegrationMockkTest {

    @Autowired
    lateinit var mvc: MockMvc

    @Test
    fun quandoChamado_deveRetornarHelloWorld() {
        mvc.perform(MockMvcRequestBuilders.get("/hello"))
            .andExpect(MockMvcResultMatchers.content().string("hello world"))
    }

    @Test
    fun quandoChamado_deveRetornarHelloService() {
        mvc.perform(MockMvcRequestBuilders.get("/hello-service"))
            .andExpect(MockMvcResultMatchers.content().string("Hello service"))
    }

    @Test
    fun quandoChamado_deveRetornarJson() {
        mvc.perform(MockMvcRequestBuilders.get("/hello-dto"))
            .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
    }
}