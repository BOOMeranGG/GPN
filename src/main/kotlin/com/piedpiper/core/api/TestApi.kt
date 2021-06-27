package com.piedpiper.core.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestApi {

    @GetMapping("/test")
    fun test(): ResponseEntity<Any> {
        return ResponseEntity.ok("Hello Motherfucker!")
    }
}