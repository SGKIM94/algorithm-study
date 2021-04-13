package algorithm.leetcode.problems;

/**
 * leetcode
 * IsPowerOfTwo
 * level : easy
 * https://leetcode.com/problems/power-of-two/
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        while (n != 2) {
            if (n % 2 != 0) {
                return false;
            }

            n = n / 2;
        }

        return true;
    }
}
