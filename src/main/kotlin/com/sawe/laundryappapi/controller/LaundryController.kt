package com.sawe.laundryappapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class LaundryController {

    @GetMapping("/api")
    fun helloWorld() = "Hello World"
}