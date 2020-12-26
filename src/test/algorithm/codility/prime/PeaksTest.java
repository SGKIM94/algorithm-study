package algorithm.codility.prime;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PeaksTest {
    @Test
    public void solution() {
        Peaks peaks = new Peaks();
        int answer = peaks.solution(new int[]{1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2});

        System.out.println(answer);

        //then
        assertThat(answer, is(3));
    }
}
