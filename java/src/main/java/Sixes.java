public class Sixes implements Category {
    public int calculate(int d1, int d2, int d3, int d4, int d5) {
        return new Score(d1, d2, d3, d4, d5).sixes();
    }
}
