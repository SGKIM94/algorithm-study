package algorithm.programmers.dfs.re;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TargetNumberTest {

    @Test
    public void solution() {
        TargetNumber targetNumber = new TargetNumber();

        int answer = targetNumber.solution(new int[]{1, 1, 1, 1, 1}, 3);

        assertThat(answer, is(5));
    }
}
