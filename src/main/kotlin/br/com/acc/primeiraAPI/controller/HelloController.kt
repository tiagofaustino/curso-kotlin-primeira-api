package br.com.acc.primeiraAPI.controller

import br.com.acc.primeiraAPI.model.HelloDTO
import br.com.acc.primeiraAPI.service.HelloService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HelloController(val helloService: HelloService) {

    @GetMapping("/hello")
    fun helloKotlin(): ResponseEntity<String> {
        return ResponseEntity("hello world", HttpStatus.OK)
    }

    @GetMapping("/hello-service")
    fun helloKotlinService(): ResponseEntity<String> {
        return ResponseEntity(helloService.getHello(), HttpStatus.OK)
    }

    @GetMapping("/hello-dto")
    fun helloKotlinDto(): ResponseEntity<HelloDTO> {
        return ResponseEntity(helloService.getHelloDto(), HttpStatus.OK)
    }

    @GetMapping("/hello-voce")
    fun helloKotlinVoce(): ResponseEntity<String> {
        return ResponseEntity("Tiago", HttpStatus.OK)
    }

    @GetMapping("/hello-brasil")
    fun helloKotlinBrasil(): ResponseEntity<String> {
        return ResponseEntity("Brasil", HttpStatus.OK)
    }

}