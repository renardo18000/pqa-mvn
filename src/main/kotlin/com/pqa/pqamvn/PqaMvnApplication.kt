package com.pqa.pqamvn

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PqaMvnApplication

fun main(args: Array<String>) {
    //start the app
    runApplication<PqaMvnApplication>(*args)
}
