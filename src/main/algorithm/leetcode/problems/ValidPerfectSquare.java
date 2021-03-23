package algorithm.leetcode.problems;

/**
 * leetcode
 * ValidPerfectSquare
 * level : easy
 * https://leetcode.com/problems/valid-perfect-square/
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        long number = 1;
        while (number * number < num) {
            number += 1;

            if (number * number == num) {
                return true;
            }
        }

        return false;
    }
}
