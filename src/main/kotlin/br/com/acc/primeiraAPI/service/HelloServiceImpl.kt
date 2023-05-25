package br.com.acc.primeiraAPI.service

import org.springframework.stereotype.Service

@Service
class HelloServiceImpl : HelloService {
    override fun verify(): String {
        return "OK"
    }
}