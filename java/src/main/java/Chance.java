import org.apache.commons.lang3.ArrayUtils;

public class Chance implements Category {

    @Override
    public int calculate(int d1, int d2, int d3, int d4, int d5) {
        return Score.chance(d1, d2, d3, d4, d5);
    }

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
