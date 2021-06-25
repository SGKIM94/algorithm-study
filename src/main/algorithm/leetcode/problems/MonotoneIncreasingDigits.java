package algorithm.leetcode.problems;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/monotone-increasing-digits/
 * Monotone Increasing Digits
 * medium
 */
public class MonotoneIncreasingDigits {

    public int monotoneIncreasingDigits(int N) {
        char[] digit = (N + "").toCharArray();

        int sizeOfDigit = digit.length;

        for (int i = sizeOfDigit - 1; i > 0; i--) {
            if (digit[i] < digit[i - 1]) {
                digit[i - 1]--;
                sizeOfDigit = i;
            }
        }

        Arrays.fill(digit, sizeOfDigit, digit.length, '9');

        return Integer.parseInt(new String(digit));
    }
}
