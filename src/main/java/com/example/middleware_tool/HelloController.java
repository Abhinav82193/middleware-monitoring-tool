package com.example.middleware_tool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/health")
public String health() {
    return """
           {
             "status": "UP",
             "message": "Middleware Monitoring Tool is running smoothly!",
             "developer": "From Support Engineer to Java Developer❤️"
           }
           """;
}
}
