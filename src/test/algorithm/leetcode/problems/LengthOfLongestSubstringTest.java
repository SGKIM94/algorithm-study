package algorithm.leetcode.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthOfLongestSubstringTest {

    @Test
    public void lengthOfLongestSubstring() {
        int length = LengthOfLongestSubstring.solution("pwwkew");

        assertEquals(length, 3);
    }

    @Test
    public void lengthOfLongestSubstring_second() {
        int length = LengthOfLongestSubstring.solution("au");

        assertEquals(length, 2);
    }

    @Test
    public void lengthOfLongestSubstring_three() {
        int length = LengthOfLongestSubstring.solution("dvdf");

        assertEquals(length, 3);
    }

}
