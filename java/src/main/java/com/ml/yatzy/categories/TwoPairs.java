package com.ml.yatzy.categories;

public class TwoPairs implements Category {
    public int calculate(int[] dices) {
        int maxNumber = 6; // TODO: extract

        int[] counts = new int[maxNumber];

        for (int dice : dices) {
            counts[dice - 1]++;
        }

        int n = 0;
        int score = 0;
        for (int i = counts.length - 1; i >= 0; i--)
            if (counts[i] >= 2) {
                n++;
                score += i + 1;
            }
        if (n == 2)
            return score * 2;
        else
            return 0;
    }
}
