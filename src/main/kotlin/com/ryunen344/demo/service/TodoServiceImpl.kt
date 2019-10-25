package com.ryunen344.demo.service

import com.ryunen344.demo.repository.TodoRepository
import com.ryunen344.demo.service.interfaces.TodoService
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import org.springframework.stereotype.Service

@Service
class TodoServiceImpl(private val repository: TodoRepository) : TodoService {

    override suspend fun suspendStr(): String = coroutineScope {

        val responseData = async {
            delay(2000)
            "suspended string"
        }

        return@coroutineScope responseData.await()
    }
}