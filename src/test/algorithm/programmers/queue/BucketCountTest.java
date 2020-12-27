package algorithm.programmers.queue;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BucketCountTest {
    @Test
    public void solution() {
        //given
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        //when
        BucketCount solution2 = new BucketCount();
        int answer = solution2.solution(board, moves);

        //then
        assertThat(answer, is(4));
    }
}
