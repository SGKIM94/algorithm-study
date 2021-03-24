package algorithm.leetcode.problems;

import org.junit.jupiter.api.Test;

public class ValidPerfectSquareTest {
    @Test
    public void ValidPerfectSquare() {
        //given
        ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();
        //when

        boolean perfectSquare = validPerfectSquare.isPerfectSquare(8);

        //then
        assertThat(perfectSquare).isTrue;
    }
}
