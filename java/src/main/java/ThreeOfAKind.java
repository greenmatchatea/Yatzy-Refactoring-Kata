public class ThreeOfAKind extends CategoryNumberOfAKind {

    private static final int CATEGORY_NUMBER_OF_A_KIND = 3;

    ThreeOfAKind() {
        super(CATEGORY_NUMBER_OF_A_KIND);
    }

    public int calculate(int d1, int d2, int d3, int d4, int d5) {
        return Score.three_of_a_kind(d1, d2, d3, d4, d5);
    }
}
