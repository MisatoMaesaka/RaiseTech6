package com.sixassignment.helloworld;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class XxxOmikuziService {

    public String omikuzi() {
        // 大吉、中吉、末吉、凶のいずれかをランダムに表示する
        // ただし大吉と凶の出る確率は低くする
        String result = "";
        Random random = new Random();
        int num = random.nextInt(100);
        if (num < 10) {
            result = "大吉";
        } else if (num < 50) {
            result = "中吉";
        } else if (num < 90) {
            result = "末吉";
        } else {
            result = "凶";
        }

        return result;
    }

}
