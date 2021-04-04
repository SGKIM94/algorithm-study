package algorithm.leetcode.problems;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

public class XorOperationTest {
    @Test
    public void xorOperation() {
        //given
        XorOperation xorOperation = new XorOperation();
        //when

        int answer = xorOperation.solution(8, 3);

        //then
        MatcherAssert.assertThat(answer, is(5));
    }

}
