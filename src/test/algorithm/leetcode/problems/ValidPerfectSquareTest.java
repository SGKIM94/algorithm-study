package algorithm.leetcode.problems;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

public class ValidPerfectSquareTest {
    @Test
    public void ValidPerfectSquare() {
        //given
        ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();
        //when

        boolean perfectSquare = validPerfectSquare.isPerfectSquare(8);

        //then
        MatcherAssert.assertThat(perfectSquare, is(true));
    }
}
