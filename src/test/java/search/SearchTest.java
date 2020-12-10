package java.search;

import java.queue.StockPrice;
import java.util.HashMap;
import java.util.Map;

public class SearchTest {
    @org.junit.jupiter.api.Test
    public void solution() {
        StockPrice solution = new StockPrice();
        Map<String, String> 123 = new HashMap<>()

        String solution = solution.solution(new int[]{3, 30, 34, 5, 9});

        System.out.println(solution);

        //then
        assertThat(solution).isEqualTo("9534330");
    }

}
