public class Twos extends CategoryNumber {

    private static final int CATEGORY_NUMBER = 2;

    Twos() {
        super(CATEGORY_NUMBER);
    }

    public int calculate(int d1, int d2, int d3, int d4, int d5) {
        return Score.twos(d1, d2, d3, d4, d5);
    }
}
