package com.piedpiper.core.dto.response

import java.time.LocalDateTime

data class LifecycleData(
    val name: String,
    val createdAt: LocalDateTime
)
