package algorithm.leetcode.problems;

/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
 * Remove All Adjacent Duplicates in String II
 * medium
 */
public class RemoveAllAdjacentDuplicates {
    public String removeDuplicates(String s, int k) {
        int count = 1;

        int sizeOfString = s.length();
        for (int i = 0; i < sizeOfString - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count == k) {
                s = removeDuplicates(s.substring(0, i - k + 2) + s.substring(i + 2), k);
            }
        }

        return s;
    }
}
