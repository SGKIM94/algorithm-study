package algorithm.leetcode.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntegerAtoiTest {

    @Test
    public void myAtoi() {
        StringToIntegerAtoi solution = new StringToIntegerAtoi();

        int answer = solution.myAtoi("     -42");

        assertEquals(answer, -42);
    }

    @Test
    public void myAtoi_second() {
        StringToIntegerAtoi solution = new StringToIntegerAtoi();

        int answer = solution.myAtoi("4193 with words");

        assertEquals(answer, 4193);
    }


    @Test
    public void myAtoi_third() {
        StringToIntegerAtoi solution = new StringToIntegerAtoi();

        int answer = solution.myAtoi("words and 987");

        assertEquals(answer, 0);
    }

    @Test
    public void myAtoi_fourth() {
        StringToIntegerAtoi solution = new StringToIntegerAtoi();

        int answer = solution.myAtoi("-91283472332");

        assertEquals(answer, Integer.MIN_VALUE);
    }

    @Test
    public void myAtoi_fifth() {
        StringToIntegerAtoi solution = new StringToIntegerAtoi();

        int answer = solution.myAtoi("+-12");

        assertEquals(answer, 0);
    }

    @Test
    public void myAtoi_sixth() {
        StringToIntegerAtoi solution = new StringToIntegerAtoi();

        int answer = solution.myAtoi("+");

        assertEquals(answer, 0);
    }

    @Test
    public void myAtoi_seven() {
        StringToIntegerAtoi solution = new StringToIntegerAtoi();

        int answer = solution.myAtoi("   +0 123");

        assertEquals(answer, 0);
    }

}
