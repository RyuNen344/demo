package com.ryunen344.demo.entity

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "todo")
@noArgClass
data class ToDo(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "todo_id", nullable = false)
        var toDoId: Int,

        @Column(name = "user_id", nullable = false)
        var userId: Int,

        @Column(name = "todo_detail", nullable = true)
        var todoDetail: String,

        @Column(name = "complete_flg", nullable = false)
        var completeFlg: Boolean,

        @Column(name = "del_flg", nullable = false)
        var delFlg: Boolean

) : Serializable