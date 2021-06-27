package com.piedpiper.core.dto.response

data class InstrumentData(
    val id: String,
    val contractor: String,
    val equipment: String,
    val hardwareParameters: String,
    val lifecycles: List<LifecycleData>,
    val status: String,
    val name: String
)
