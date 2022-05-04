public class Ones implements Category {
    private static final int CATEGORY_NUMBER = 1;

    public int calculate(int d1, int d2, int d3, int d4, int d5) {
        return Score.ones(d1, d2, d3, d4, d5);
    }

    public int calculate(int[] dices) {
        int score = 0;

        for (int dice : dices) {
            if (dice == CATEGORY_NUMBER) {
                score += dice;
            }
        }

        return score;
    }
}
