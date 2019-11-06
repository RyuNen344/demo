package com.ryunen344.demo.repository

import com.ryunen344.demo.domain.TodoEntity
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository : R2dbcRepository<TodoEntity, Int> {
}