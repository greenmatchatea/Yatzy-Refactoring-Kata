import java.util.Arrays;

public class LargeStraight implements Category {
    public int calculate(int d1, int d2, int d3, int d4, int d5) {
        return Score.largeStraight(d1, d2, d3, d4, d5);
    }

    public int calculate(int[] dices) {
        Arrays.sort(dices);

        if (dices[dices.length - 1] != 6) { // TODO: extract 6
            return 0;
        }

        int score = dices[dices.length - 1];
        for (int i = dices.length - 2; i >= 0; i--) {
            if (dices[i] != (dices[i + 1] - 1)) {
                return 0;
            }
            score += dices[i];
        }

        return score;
    }
}
