package algorithm.exam.coupang;

import org.junit.Test;
import unknown.XYLazer;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class XYLazerTest {

    @Test
    public void solution() {
        XYLazer XYLazer = new XYLazer();
        int[] v1 = new int[]{2, 2};
        int[] v2 = new int[]{4, 4};
        int[] v3 = new int[]{1, 4};
        int[] v4 = new int[]{-1, -4};

        int[][] links = new int[][]{v1, v2, v3, v4};

        int solution = XYLazer.solution(links);
        assertThat(solution, is(3));
    }
}
