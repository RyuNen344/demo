package com.ryunen344.demo.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user")
data class User(

        @Id
        @Column(name = "user_id", nullable = false)
        var user_id: Int
) : Serializable