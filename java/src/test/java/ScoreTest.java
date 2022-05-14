import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ScoreTest {

    @Test
    public void test_given_roll_in_category_chance() {
        assertEquals(14, new Chance().calculate(new int[]{1, 1, 3, 3, 6}));
        assertEquals(21, new Chance().calculate(new int[]{4, 5, 5, 6, 1}));
    }

    @Test
    public void test_given_roll_in_category_yatzy() {
        assertEquals(50, new Yatzy().calculate(new int[]{1, 1, 1, 1, 1}));
        assertEquals(0, new Yatzy().calculate(new int[]{1, 1, 1, 2, 1}));
    }

    @Test
    public void test_given_roll_in_category_ones() {
        assertEquals(2, new Ones().calculate(new int[]{1, 1, 2, 4, 4}));
        assertEquals(0, new Ones().calculate(new int[]{3, 3, 3, 4, 5}));
    }

    @Test
    public void test_given_roll_in_category_twos() {
        assertEquals(4, new Twos().calculate(new int[]{2, 3, 2, 5, 1}));
        assertEquals(0, new Twos().calculate(new int[]{3, 3, 3, 4, 5}));
    }

    @Test
    public void test_given_roll_in_category_threes() {
        assertEquals(0, new Threes().calculate(new int[]{1, 1, 2, 4, 4}));
        assertEquals(9, new Threes().calculate(new int[]{3, 3, 3, 4, 5}));
    }

    @Test
    public void test_given_roll_in_category_fours() {
        assertEquals(8, new Fours().calculate(new int[]{1, 1, 2, 4, 4}));
        assertEquals(0, new Fours().calculate(new int[]{2, 3, 2, 5, 1}));
    }

    @Test
    public void test_given_roll_in_category_fives() {
        assertEquals(0, new Fives().calculate(new int[]{1, 1, 2, 4, 4}));
        assertEquals(5, new Fives().calculate(new int[]{2, 3, 2, 5, 1}));
    }

    @Test
    public void test_given_roll_in_category_sixes() {
        assertEquals(6, new Sixes().calculate(new int[]{1, 1, 3, 3, 6}));
        assertEquals(0, new Sixes().calculate(new int[]{2, 3, 2, 5, 1}));
    }

    @Test
    public void test_given_roll_in_category_pairs() {
        assertEquals(0, new Pairs().calculate(new int[]{1, 2, 3, 4, 5}));
        assertEquals(8, new Pairs().calculate(new int[]{3, 3, 3, 4, 4}));
        assertEquals(12, new Pairs().calculate(new int[]{1, 1, 6, 2, 6}));
        assertEquals(6, new Pairs().calculate(new int[]{3, 3, 3, 4, 1}));
        assertEquals(6, new Pairs().calculate(new int[]{3, 3, 3, 3, 1}));
    }

    @Test
    public void test_given_roll_in_category_two_pairs() {
        assertEquals(8, new TwoPairs().calculate(new int[]{1, 1, 2, 3, 3}));
        assertEquals(0, new TwoPairs().calculate(new int[]{1, 1, 2, 3, 4}));
        assertEquals(6, new TwoPairs().calculate(new int[]{1, 1, 2, 2, 2}));
        assertEquals(0, new TwoPairs().calculate(new int[]{3, 3, 3, 3, 1}));
    }

    @Test
    public void test_given_roll_in_category_three_of_a_kind() {
        assertEquals(9, new ThreeOfAKind().calculate(new int[]{3, 3, 3, 4, 5}));
        assertEquals(0, new ThreeOfAKind().calculate(new int[]{3, 3, 4, 5, 6}));
        assertEquals(9, new ThreeOfAKind().calculate(new int[]{3, 3, 3, 3, 1}));
    }

    @Test
    public void test_given_roll_in_category_four_of_a_kind() {
        assertEquals(8, new FourOfAKind().calculate(new int[]{2, 2, 2, 2, 5}));
        assertEquals(0, new FourOfAKind().calculate(new int[]{2, 2, 2, 5, 5}));
        assertEquals(8, new FourOfAKind().calculate(new int[]{2, 2, 2, 2, 2}));
    }

    @Test
    public void test_given_roll_in_category_small_straight() {
        assertEquals(15, new SmallStraight().calculate(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, new SmallStraight().calculate(new int[]{2, 3, 4, 5, 6}));
    }

    @Test
    public void test_given_roll_in_category_large_straight() {
        assertEquals(0, new LargeStraight().calculate(new int[]{1, 2, 3, 4, 5}));
        assertEquals(20, new LargeStraight().calculate(new int[]{2, 3, 4, 5, 6}));
    }

    @Test
    public void test_given_roll_in_category_full_house() {
        assertEquals(8, new FullHouse().calculate(new int[]{1, 1, 2, 2, 2}));
        assertEquals(0, new FullHouse().calculate(new int[]{2, 2, 3, 3, 4}));
        assertEquals(0, new FullHouse().calculate(new int[]{4, 4, 4, 4, 4}));
    }

    @Test
    public void chance_scores_sum_of_all_dice() {
        int expected = 15;
        int actual = Score.chance(2, 3, 4, 5, 1);
        assertEquals(expected, actual);
        assertEquals(16, Score.chance(3, 3, 4, 5, 1));
    }

    @Test
    public void yatzy_scores_50() {
        int expected = 50;
        int actual = Score.yatzy(4, 4, 4, 4, 4);
        assertEquals(expected, actual);
        assertEquals(50, Score.yatzy(6, 6, 6, 6, 6));
        assertEquals(0, Score.yatzy(6, 6, 6, 6, 3));
    }

    @Test public void test_1s() {
        assertTrue(Score.ones(1, 2, 3, 4, 5) == 1);
        assertEquals(2, Score.ones(1, 2, 1, 4, 5));
        assertEquals(0, Score.ones(6, 2, 2, 4, 5));
        assertEquals(4, Score.ones(1, 2, 1, 1, 1));
    }

    @Test
    public void test_2s() {
        assertEquals(4, Score.twos(1, 2, 3, 2, 6));
        assertEquals(10, Score.twos(2, 2, 2, 2, 2));
    }

    @Test
    public void test_threes() {
        assertEquals(6, Score.threes(1, 2, 3, 2, 3));
        assertEquals(12, Score.threes(2, 3, 3, 3, 3));
    }

    @Test
    public void fours_test() {
        assertEquals(12, new Score(4, 4, 4, 5, 5).fours());
        assertEquals(8, new Score(4, 4, 5, 5, 5).fours());
        assertEquals(4, new Score(4, 5, 5, 5, 5).fours());
    }

    @Test
    public void fives() {
        assertEquals(10, new Score(4, 4, 4, 5, 5).fives());
        assertEquals(15, new Score(4, 4, 5, 5, 5).fives());
        assertEquals(20, new Score(4, 5, 5, 5, 5).fives());
    }

    @Test
    public void sixes_test() {
        assertEquals(0, new Score(4, 4, 4, 5, 5).sixes());
        assertEquals(6, new Score(4, 4, 6, 5, 5).sixes());
        assertEquals(18, new Score(6, 5, 6, 6, 5).sixes());
    }

    @Test
    public void one_pair() {
        assertEquals(6, Score.score_pair(3, 4, 3, 5, 6));
        assertEquals(10, Score.score_pair(5, 3, 3, 3, 5));
        assertEquals(12, Score.score_pair(5, 3, 6, 6, 5));
    }

    @Test
    public void two_Pair() {
        assertEquals(16, Score.two_pair(3, 3, 5, 4, 5));
        assertEquals(16, Score.two_pair(3, 3, 5, 5, 5));
    }

    @Test
    public void three_of_a_kind() {
        assertEquals(9, Score.three_of_a_kind(3, 3, 3, 4, 5));
        assertEquals(15, Score.three_of_a_kind(5, 3, 5, 4, 5));
        assertEquals(9, Score.three_of_a_kind(3, 3, 3, 3, 5));
    }

    @Test
    public void four_of_a_knd() {
        assertEquals(12, Score.four_of_a_kind(3, 3, 3, 3, 5));
        assertEquals(20, Score.four_of_a_kind(5, 5, 5, 4, 5));
        assertEquals(9, Score.three_of_a_kind(3, 3, 3, 3, 3));
    }

    @Test
    public void smallStraight() {
        assertEquals(15, Score.smallStraight(1, 2, 3, 4, 5));
        assertEquals(15, Score.smallStraight(2, 3, 4, 5, 1));
        assertEquals(0, Score.smallStraight(1, 2, 2, 4, 5));
    }

    @Test
    public void largeStraight() {
        assertEquals(20, Score.largeStraight(6, 2, 3, 4, 5));
        assertEquals(20, Score.largeStraight(2, 3, 4, 5, 6));
        assertEquals(0, Score.largeStraight(1, 2, 2, 4, 5));
    }

    @Test
    public void fullHouse() {
        assertEquals(18, Score.fullHouse(6, 2, 2, 2, 6));
        assertEquals(0, Score.fullHouse(2, 3, 4, 5, 6));
    }
}
