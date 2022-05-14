package com.ml.yatzy.categories;

import org.apache.commons.lang3.ArrayUtils;

public class Chance implements Category {

    @Override
    public int calculate(int[] dices) {
        if (ArrayUtils.isEmpty(dices)) {
            return -1;
        }

        int total = 0;

        for (int dice : dices) {
            total += dice;
        }

        return total;
    }
}
