package algorithm.leetcode.problems;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RomanToIntTest {

    @Test
    public void romanToInt() {
        RomanToInt romanToInt = new RomanToInt();

        int answer = romanToInt.romanToInt("LVIII");

        assertThat(answer, is(58));
    }
}
