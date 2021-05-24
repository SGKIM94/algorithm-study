package algorithm.leetcode.problems;

/**
 * leetcode
 * ReserveStringTwo
 *  easy
 *  https://leetcode.com/problems/reverse-string-ii/
 */
public class ReserveStringTwo {
    public String reverse(String s, int k) {
        char[] chars = s.toCharArray();

        int sizeOfChars = chars.length;

        for (int i = 0; i < sizeOfChars; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, sizeOfChars - 1);

            while (start < end) {
                char temp = chars[start];

                chars[start] = chars[end];
                chars[end] = temp;

                start++;
                end--;
            }
        }

        return String.valueOf(chars);
    }
}
