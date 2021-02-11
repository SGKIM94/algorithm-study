package algorithm.exam.coupang;

import org.junit.Test;
import unknown.BirthdayCandle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DPTreeTest {
    @Test
    public void solution() {
        BirthdayCandle birthDayCandle = new BirthdayCandle();
        int solution = birthDayCandle.solution(new int[]{23, 61, 46, 100});

        assertThat(solution, is(1));
    }
}
