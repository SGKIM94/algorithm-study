package algorithm.programmers.sort;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NumberOfKTest {
    @Test
    public void solution() {
        NumberOfK solution = new NumberOfK();

        List<Integer> answer
                = solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});

        //then
        assertThat(answer, is(5));
    }
}
