package com.piedpiper.core.api

import com.piedpiper.core.dto.request.WellsRequest
import com.piedpiper.core.service.WellsService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class WellsController(
    private val wellsService: WellsService
) {

    @PostMapping("/well")
    fun createWell(@RequestBody request: WellsRequest): ResponseEntity<Any> {
        wellsService.createWell(request)

        return ResponseEntity(HttpStatus.OK)
    }
}