package com.ryunen344.demo.service.interfaces

import com.ryunen344.demo.domain.TodoEntity

interface TodoService {
    suspend fun suspendStr(): String
    suspend fun selectAll(): MutableList<TodoEntity>?
}