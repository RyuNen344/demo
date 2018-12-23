package com.ryunen344.demo.repository

import com.ryunen344.demo.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int>