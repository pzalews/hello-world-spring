package com.example.helloworldspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello-world";
    }

    @GetMapping("/square")
    public int square(@RequestParam int number) {
        return number * number;
    }
}