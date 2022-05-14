package com.ml.yatzy.categories;

public class Yatzy implements Category {
    private static final int YATZY_SCORE = 50;

    public int calculate(int[] dices) {
        for (int i = 0; i < dices.length - 1; i++) {
            if (dices[i] != dices[i + 1]) {
                return 0;
            }
        }

        return YATZY_SCORE;
    }
}
