package com.ryunen344.demo.service

import com.ryunen344.demo.repository.TodoRepository
import com.ryunen344.demo.service.interfaces.TodoService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class TodoServiceImpl(private val repository : TodoRepository) : TodoService {
}