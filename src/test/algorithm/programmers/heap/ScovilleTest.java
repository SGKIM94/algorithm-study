package algorithm.programmers.heap;

import algorithm.programmers.queue.BucketCount;
import org.junit.jupiter.api.Test;

public class ScovilleTest {
    @Test
    public void solution() {
        //given
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        //when
        BucketCount solution2 = new BucketCount();
        int answer = solution2.solution(board, moves);
    }
}
