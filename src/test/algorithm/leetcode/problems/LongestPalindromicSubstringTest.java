package algorithm.leetcode.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubstringTest {

    @Test
    public void longestPalindrome() {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        String answer = solution.longestPalindrome("babad");

        assertEquals(answer, "bab");
    }

    @Test
    public void longestPalindrome_second() {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        String answer = solution.longestPalindrome("bb");

        assertEquals(answer, "bb");
    }

    @Test
    public void longestPalindrome_third() {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        String answer = solution.longestPalindrome("abb");

        assertEquals(answer, "bb");
    }

    @Test
    public void longestPalindrome_fourth() {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        String answer = solution.longestPalindrome("aacabdkacaa");

        assertEquals(answer, "aca");
    }

}
