package com.example.github_test_1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application";
    }
}
