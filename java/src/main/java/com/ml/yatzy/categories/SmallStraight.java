package com.ml.yatzy.categories;

import java.util.Arrays;

public class SmallStraight implements Category {
    public int calculate(int[] dices) {
        Arrays.sort(dices);

        if (dices[0] != 1) { // TODO: extract 1
            return 0;
        }

        int score = dices[0];
        for (int i = 1; i < dices.length; i++) {
            if (dices[i] != (dices[i - 1] + 1)) {
                return 0;
            }
            score += dices[i];
        }

        return score;
    }
}
