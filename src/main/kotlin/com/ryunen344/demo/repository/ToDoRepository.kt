package com.ryunen344.demo.repository

import com.ryunen344.demo.entity.ToDo
import org.springframework.data.jpa.repository.JpaRepository

interface ToDoRepository : JpaRepository<ToDo, Int> {
    fun findByToDoId(todo_id: Int): ToDo?
    fun findByUserId(user_id: Int): List<ToDo>
}