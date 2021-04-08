package algorithm.leetcode.problems;

/**
 * leetcode
 * RemovePalindromeSub
 * level : easy
 */
public class RemovePalindromeSub {
    public int removePalindromeSub(String s) {
        StringBuilder strings = new StringBuilder(s);

        if (s.equals((strings.reverse()).toString())) {
            return 1;
        }

        return 2;
    }
}
