package com.ml.yatzy.categories;

public class FullHouse implements Category {
    public int calculate(int[] dices) {
        int maxNumber = 6; // TODO: extract

        int[] counts = new int[maxNumber];

        for (int dice : dices) {
            counts[dice - 1]++;
        }

        int scoreOf2 = 0;
        int scoreOf3 = 0;
        for (int i = maxNumber - 1; i >= 0; i--) {
            if (counts[i] == ThreeOfAKind.CATEGORY_NUMBER_OF_A_KIND) {
                scoreOf3 += (i + 1) * ThreeOfAKind.CATEGORY_NUMBER_OF_A_KIND;
            }
            if (counts[i] == Pairs.CATEGORY_NUMBER_OF_A_KIND) {
                scoreOf2 += (i + 1) * Pairs.CATEGORY_NUMBER_OF_A_KIND;
            }
        }

        if (scoreOf2 > 0 && scoreOf3 > 0) {
            return (scoreOf2 + scoreOf2) * 2;
        } else {
            return 0;
        }
    }
}
