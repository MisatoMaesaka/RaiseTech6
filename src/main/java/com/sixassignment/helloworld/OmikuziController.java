package com.sixassignment.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OmikuziController {

    private final XxxOmikuziService xxxOmikuziService;

    @Autowired
    public OmikuziController(XxxOmikuziService xxxOmikuziService) {
        this.xxxOmikuziService = xxxOmikuziService;
    }

    @GetMapping("/omikuzi")
    public Map<String, String> omikuzi() {
        String result = xxxOmikuziService.omikuzi();
        return Map.of("result", result);
    }
}
