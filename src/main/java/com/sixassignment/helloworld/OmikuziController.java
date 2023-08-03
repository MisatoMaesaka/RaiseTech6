package com.sixassignment.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

// アプリケーション層
@RestController
public class OmikuziController {

    // クラス内でのみ使用する定数の定義
    private final OmikuziService OmikuziService;

    public OmikuziController(OmikuziService OmikuziService) {
        this.OmikuziService = OmikuziService;
    }

    // @GetMappingアノテーションでGETリクエスト
    @GetMapping("/omikuzi")
    public Map<String, String> omikuzi() {
        String result = OmikuziService.omikuzi();
        return Map.of("result : ", result);
    }

}
