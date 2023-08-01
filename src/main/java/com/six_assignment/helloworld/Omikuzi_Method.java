package com.six_assignment.helloworld;

import java.util.Random;

public class Omikuzi_Method {
    public static void main(String[] args) {

        // おみくじの番号を求める処理
        int number = getOmikujiNo();

        // 乱数からおみくじの結果を求める処理
        String result = getOmikujiResult(number);

        // おみくじの結果を表示する処理
        showOmikuji(result);
    }

    private static int getOmikujiNo() {
        Random rand = new Random();
        return rand.nextInt(4);
    }

    private static String getOmikujiResult(int no) {
        String result;
        if (no == 0) {
            result = "大吉";
        } else if (no == 1) {
            result = "中吉";
        } else if (no == 2) {
            result = "末吉";
        } else {
            result = "凶";
        }
        return result;
    }

    private static void showOmikuji(String result) {
        System.out.println(result);
    }
}
