package algorithm.leetcode.problems;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TwoSumsTest {

    @Test
    public void twoSum() {
        TwoSums solution = new TwoSums();

        int[] answer = solution.twoSum(new int[]{3, 2, 4}, 6);

        assertThat(answer[0], is(1));
        assertThat(answer[1], is(2));
    }
}
