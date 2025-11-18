package com.example.middleware_tool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/health")
    public String health() {
        return "BHAI SERVER LIVE HAI ❤️\n" +
               "TU AB JAVA SPRING BOOT DEVELOPER HAI!!! 🔥\n" +
               "18 NOV 2025 - YE DIN YAAD RAKHNA!";
    }
}
