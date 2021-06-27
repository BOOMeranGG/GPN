package com.piedpiper.core.api

import com.piedpiper.core.dto.response.InstrumentOnWellResponse
import com.piedpiper.core.dto.response.OutsideInstrumentsResponse
import com.piedpiper.core.service.InstrumentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class InstrumentController(
    private val instrumentService: InstrumentService
) {

    @GetMapping("/instrument/outside")
    fun getOutsideInstruments(): ResponseEntity<OutsideInstrumentsResponse> {
        return ResponseEntity.ok(instrumentService.getOutsideInstruments())
    }

    @GetMapping("/instrument/on_well")
    fun getWellsInstruments(): ResponseEntity<InstrumentOnWellResponse?> {
        return ResponseEntity.ok(instrumentService.getWellsInstruments())
    }
}