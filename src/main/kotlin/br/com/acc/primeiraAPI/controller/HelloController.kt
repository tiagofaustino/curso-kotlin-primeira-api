package br.com.acc.primeiraAPI.controller

import br.com.acc.primeiraAPI.service.HelloService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HelloController(val helloService: HelloService) {

    @GetMapping("verify")
    fun verify(): ResponseEntity<String> {
        return ResponseEntity(helloService.verify(), HttpStatus.OK)
    }
}