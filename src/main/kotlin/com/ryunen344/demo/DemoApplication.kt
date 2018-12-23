package com.ryunen344.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {

    println("main method runs")
    runApplication<DemoApplication>(*args)
}
