package algorithm.programmers.sort.re;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestNumberTest {

    @Test
    public void solution() {
        LargestNumber largestNumber = new LargestNumber();

        String answer = largestNumber.solution(new int[]{6, 10, 2});

        assertEquals(answer, "6210");
    }

    @Test
    public void second_solution() {
        LargestNumber largestNumber = new LargestNumber();

        String answer = largestNumber.solution(new int[]{3, 30, 34, 5, 9});

        assertEquals(answer, "9534330");
    }

    @Test
    public void third_solution() {
        LargestNumber largestNumber = new LargestNumber();

        String answer = largestNumber.solution(new int[]{1000, 30, 34, 5, 9});

        assertEquals(answer, "9534301000");
    }

    @Test
    public void fourth_solution() {
        LargestNumber largestNumber = new LargestNumber();

        String answer = largestNumber.solution(new int[]{0, 5, 10, 15, 20});

        assertEquals(answer, "52015100");
    }

    @Test
    public void fifth_solution() {
        LargestNumber largestNumber = new LargestNumber();

        String answer = largestNumber.solution(new int[]{1000, 0, 5, 99, 100});

        assertEquals(answer, "9951001000");
    }

    @Test
    public void sixth_solution() {
        LargestNumber largestNumber = new LargestNumber();

        String answer = largestNumber.solution(new int[]{0, 0, 0, 0, 0});

        assertEquals(answer, "0");
    }

}
