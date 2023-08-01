package com.six_assignment.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OmikuziController {

    private final OmikuziService omikuziService;

    public OmikuziController(OmikuziService omikuziService) {
        this.omikuziService = omikuziService;
    }

    @GetMapping("/omikuzi")
    public Map<String, String> omikuzi() {
        String result = omikuziService.omikuzi();
        return Map.of("result", result);
    }
}

