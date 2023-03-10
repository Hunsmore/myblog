package com.hunsmore.myblog.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class IndexController {
    @GetMapping("/hello")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return String.format("Hello %s!", name);
    }
}