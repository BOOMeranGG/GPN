package com.piedpiper.core.entity

import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class BaseEntity {

    @Id
    @Column(name = "id")
    var id: String = UUID.randomUUID().toString()

    @CreationTimestamp
    @Column(name = "create_ts")
    lateinit var createTs: LocalDateTime

    @Column(name = "created_by")
    var createdBy: String? = null
}