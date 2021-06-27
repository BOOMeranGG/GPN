package com.piedpiper.core.dto.response

data class WellData(
    val id: String,
    val mineralDepositName: String,
    val number: String,
    val state: String,
    val instruments: List<InstrumentData>
)
