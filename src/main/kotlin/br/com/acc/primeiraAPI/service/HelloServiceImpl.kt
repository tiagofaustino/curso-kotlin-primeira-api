package br.com.acc.primeiraAPI.service

import br.com.acc.primeiraAPI.model.HelloDTO
import org.springframework.stereotype.Service

@Service
class HelloServiceImpl : HelloService {
    override fun getHello(): String {
        return "Hello service"
    }

    override fun getHelloDto(): HelloDTO {
        return HelloDTO("Hello from dto")
    }
}