package com.six_assignment.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping("/Omikuzihello")
    public String hello() {
        return "Hello";
    }
}

