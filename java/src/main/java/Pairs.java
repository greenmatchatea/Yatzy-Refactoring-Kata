public class Pairs implements Category {
    public int calculate(int d1, int d2, int d3, int d4, int d5) {
        return Score.score_pair(d1, d2, d3, d4, d5);
    }

    public int calculate(int[] dices) {
        int maxNumber = 6; // TODO: extract

        int[] counts = new int[maxNumber];

        for (int dice : dices) {
            counts[dice - 1]++;
        }

        for (int i = maxNumber - 1; i >= 0; i--) {
            if (counts[i] >= 2)
                return (i + 1) * 2;
        }

        return 0;
    }
}
