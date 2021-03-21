package algorithm.leetcode.problems;

/**
 * leetcode
 * ImplementStr
 * level : easy
 * https://leetcode.com/problems/implement-strstr/
 */
public class ImplementStr {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0;
        }

        int sizeOfHayStack = haystack.length();
        int sizeOfNeedle = needle.length();
        for (int i = 0; i < sizeOfHayStack - sizeOfNeedle + 1; i++) {
            int limit = i + needle.length();

            if (haystack.substring(i,limit).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
