package br.com.acc.primeiraAPI.service

import br.com.acc.primeiraAPI.model.HelloDTO

interface HelloService {

    fun getHello(): String
    fun getHelloDto(): HelloDTO

}
