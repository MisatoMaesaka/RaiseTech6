package com.sixassignment.helloworld;

import org.springframework.stereotype.Service;

import java.util.Random;

// ドメイン層　業務処理を提供
@Service
public class OmikuziService {

    // Randomクラスで乱数の生成
    Random random = new Random();
    // フィールド
    // おみくじの結果を格納する変数
    String result = "";

    // メソッド
    public String omikuzi() {
        // 大吉、吉、中吉、末吉、凶のいずれかをランダムに表示する
        // ただし大吉と凶の出る確率は低くする
        int num = random.nextInt(100);
        if (num < 15) {
            result = "大吉";
        } else if (num < 40) {
            result = "吉";
        } else if (num < 60) {
            result = "中吉";
        } else if (num < 90) {
            result = "末吉";
        } else {
            result = "凶";
        }

        return result;
    }

}
