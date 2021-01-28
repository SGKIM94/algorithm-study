package algorithm.leetcode.problems;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class PalindromeNumberTest {

    @Test
    public void isPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        boolean answer = palindromeNumber.isPalindrome(1000021);

        assertFalse(answer);
    }
}
