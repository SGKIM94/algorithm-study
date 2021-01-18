package algorithm.exam.soca;

import org.junit.Test;
import unknown.DPTree;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DPTreeTest {

    @Test
    public void solution() {
        DPTree DPTree = new DPTree();

        int[] v1 = new int[]{4, 1};
        int[] v2 = new int[]{3, 2};
        int[] v3 = new int[]{1, 6};
        int[] v4 = new int[]{3, 5};
        int[] v5 = new int[]{5, 1};

        int[][] links = new int[][]{v1, v2, v3, v4, v5};

        int solution = DPTree.solution(6, new int[]{6, 4, 10, 9, 8, 4}, links);

        assertThat(solution, is(3));
    }
}
