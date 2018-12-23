package com.ryunen344.demo.service.impl

import com.ryunen344.demo.repository.UserRepository
import com.ryunen344.demo.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
        private val repository: UserRepository) : UserService