package algorithm.programmers.queue.re;

import algorithm.programmers.stack.re.StockPrice;
import org.junit.Test;

import java.util.Arrays;

public class StockPriceTest {

    @Test
    public void solution() {
        StockPrice stockPrice = new StockPrice();

        int[] solution = stockPrice.solution(new int[]{1, 2, 3, 2, 3});

        System.out.println(Arrays.toString(solution));
    }
}
