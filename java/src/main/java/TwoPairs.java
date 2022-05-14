public class TwoPairs implements Category {
    public int calculate(int d1, int d2, int d3, int d4, int d5) {
        return Score.two_pair(d1, d2, d3, d4, d5);
    }

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
