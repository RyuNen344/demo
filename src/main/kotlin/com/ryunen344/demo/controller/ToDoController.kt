package com.ryunen344.demo.controller

import com.ryunen344.demo.entity.ToDo
import com.ryunen344.demo.service.ToDoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["todo"])
class ToDoController(@Autowired private var service: ToDoService) {

    @GetMapping(path = ["{id}"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun id(@PathVariable(value = "id") todo_id: Int): ResponseEntity<ToDo> {
        val todo = service.findByToDoId(todo_id)
        todo?.let { return ResponseEntity.ok(todo) }
                ?.run { return ResponseEntity(HttpStatus.NOT_FOUND) }
    }
}