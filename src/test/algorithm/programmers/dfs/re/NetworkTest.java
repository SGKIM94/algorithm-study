package algorithm.programmers.dfs.re;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NetworkTest {
    @Test
    public void solution() {
        Network network = new Network();
        int[] ints = {1, 1, 0};
        int[] ints1 = {1, 1, 0};
        int[] ints2 = {0, 0, 1};
        int[][] ints3 = {ints, ints1, ints2};

        int answer = network.solution(3, ints3);

        assertThat(answer, is(2));
    }

    @Test
    public void solution_2() {
        Network network = new Network();
        int[] ints = {1, 1, 0};
        int[] ints1 = {1, 1, 1};
        int[] ints2 = {0, 1, 1};

        int[][] ints3 = {ints, ints1, ints2};

        int answer = network.solution(3, ints3);

        assertThat(answer, is(1));
    }

}
