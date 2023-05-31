package br.com.acc.primeiraAPI.model

class HelloModel(val greeting: String) {

    fun HelloModel.toResponse() = HelloDTO(
        greeting = greeting
    )
}