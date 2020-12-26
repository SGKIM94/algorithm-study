package algorithm.programmers.sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LargestNumberTest {
    @Test
    public void solution() {
        LargestNumber solution = new LargestNumber();

        String answer = solution.solution(new int[]{303, 30});

        //then
        assertThat(answer, is("30330"));
    }
}
