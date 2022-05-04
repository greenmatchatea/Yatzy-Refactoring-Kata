public class Yatzy implements Category {
    private static final int YATZY_SCORE = 50;

    public int calculate(int d1, int d2, int d3, int d4, int d5) {
        return Score.yatzy(d1, d2, d3, d4, d5);
    }

    public int calculate(int[] dices) {
        for (int i = 0; i < dices.length - 1; i++) {
            if (dices[i] != dices[i + 1]) {
                return 0;
            }
        }

        return YATZY_SCORE;
    }
}
