package algorithm.leetcode.problems;

/**
 * leetcode
 * ConcatenationOfConsecutiveBinaryNumbers
 * level : medium
 * https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/
 */
public class ConcatenationOfConsecutiveBinaryNumbers {
    public int concatenatedBinary(int n) {
        long answer = 0;
        int digits = 0;
        int mod = 1_000_000_007;

        for (int num = 1; num <= n; num++) {
            if ((num & (num - 1)) == 0) {
                ++digits;
            }

            answer = ((answer << digits) | num) % mod;
        }

        return (int) answer;
    }
}
