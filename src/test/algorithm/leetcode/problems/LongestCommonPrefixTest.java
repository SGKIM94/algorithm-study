package algorithm.leetcode.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefixTest() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String answer = solution.longestCommonPrefix(new String[]{"dog","racecar","car"});

        assertEquals(answer, "");
    }

    @Test
    public void longestCommonPrefixTest_second() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String answer = solution.longestCommonPrefix(new String[]{"flower","flow","flight"});

        assertEquals(answer, "fl");
    }

}
