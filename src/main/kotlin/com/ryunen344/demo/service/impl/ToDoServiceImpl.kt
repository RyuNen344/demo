package com.ryunen344.demo.service.impl

import com.ryunen344.demo.entity.ToDo
import com.ryunen344.demo.repository.ToDoRepository
import com.ryunen344.demo.service.ToDoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ToDoServiceImpl(
        @Autowired private val repository: ToDoRepository) : ToDoService {


    @Transactional(readOnly = true)
    override fun findByToDoId(todo_id: Int): ToDo? = repository.findByToDoId(todo_id)

    @Transactional(readOnly = true)
    override fun findByUserId(user_id: Int): List<ToDo> = repository.findByUserId(user_id)

    @Transactional(timeout = 10)
    override fun add(toDo: ToDo) {
        repository.save(toDo)
    }

    @Transactional(timeout = 10)
    override fun delete(todo_id: Int) {
        repository.deleteById(todo_id)
    }

}