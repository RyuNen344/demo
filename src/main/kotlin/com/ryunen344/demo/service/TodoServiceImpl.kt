package com.ryunen344.demo.service

import com.ryunen344.demo.domain.TodoEntity
import com.ryunen344.demo.repository.TodoRepository
import com.ryunen344.demo.service.interfaces.TodoService
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.reactive.awaitSingle
import org.slf4j.Logger
import org.springframework.stereotype.Service

@Service
class TodoServiceImpl(private val log: Logger, private val repository: TodoRepository) : TodoService {

    override suspend fun suspendStr(): String = coroutineScope {

        val responseData = async {
            delay(2000)
            "suspended string"
        }

        return@coroutineScope responseData.await()
    }

    suspend fun testInsert() {
        log.debug("start")
        val todo = TodoEntity("title", "detail", null)
        repository.save(todo).awaitSingle()
        log.debug("end")
    }

    override suspend fun selectAll(): MutableList<TodoEntity>? {
        log.debug("start")
        return repository.findAll().log().collectList().block()
    }
}