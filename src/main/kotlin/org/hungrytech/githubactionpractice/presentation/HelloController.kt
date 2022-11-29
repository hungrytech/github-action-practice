package org.hungrytech.githubactionpractice.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/v1")
@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello() = "hello world TEST"
}
