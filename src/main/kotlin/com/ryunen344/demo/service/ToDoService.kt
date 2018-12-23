package com.ryunen344.demo.service

import com.ryunen344.demo.entity.ToDo

interface ToDoService {
    fun findByToDoId(todo_id: Int): ToDo?
    fun findByUserId(user_id: Int): List<ToDo>
    fun add(toDo: ToDo)
    fun delete(todo_id: Int)
}