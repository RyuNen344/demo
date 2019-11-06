package com.ryunen344.demo.controller

import com.ryunen344.demo.domain.TodoEntity
import com.ryunen344.demo.service.TodoServiceImpl
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping(path = ["todo"])
class TodoController(private val service: TodoServiceImpl) {

    @GetMapping("/hello")
    fun hello(): Flux<String> =
            Flux.just("Hello", "World")

    @GetMapping("/stream")
    fun stream(): Flux<Sequence<Int>> {
        val stream: Sequence<Int> = generateSequence(0) { it + 1 }
        return Flux.just(stream)
    }

    @GetMapping("/coroutines")
    suspend fun hoge(): String =
            service.suspendStr()

    @GetMapping("/insert")
    suspend fun insert() =
            service.testInsert()

    @GetMapping("/get")
    suspend fun select(): List<TodoEntity>? =
            service.selectAll()
}