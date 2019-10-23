package com.ryunen344.demo.controller

import com.ryunen344.demo.service.interfaces.TodoService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["todo"])
class TodoController(private val service : TodoService) {

}