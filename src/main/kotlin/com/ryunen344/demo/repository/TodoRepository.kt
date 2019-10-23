package com.ryunen344.demo.repository

import com.ryunen344.demo.domain.TodoEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository : CrudRepository<TodoEntity, Int> {
}