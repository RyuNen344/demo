package com.ryunen344.demo.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.sql.Blob

@Table("Todo")
data class TodoEntity(
        @Id
        val id : Long?,
        val title : String,
        val detail : String?,
        val image : Blob?
) {
    constructor(title : String, detail : String?, image : Blob?) : this(null, title, detail, image)
}