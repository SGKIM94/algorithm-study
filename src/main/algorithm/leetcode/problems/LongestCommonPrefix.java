package algorithm.leetcode.problems;

/**
 * leetcode
 * LongestCommonPrefix
 * https://leetcode.com/problems/longest-common-prefix/
 * level : easy
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int sizeOfStrs = strs.length;

        if (sizeOfStrs == 0) {
            return "";
        }

        int lowestLength = 201;
        char first = ' ';

        for (String string : strs) {
            int sizeOFPrefix =  string.length();

            if (sizeOFPrefix == 0) {
                return "";
            }

            char prefix = string.charAt(0);

            if (first == ' ') {
                first = prefix;
            } else if (first != prefix) {
                return "";
            }

            lowestLength = Math.min(lowestLength, sizeOFPrefix);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(first);

        for (int i = 1; i < lowestLength; i++) {
            char prefix = strs[0].charAt(i);

            for (int j = 1; j < sizeOfStrs;j++) {
                if (prefix != strs[j].charAt(i)) {

                    return sb.toString();
                }
            }

            sb.append(prefix);
        }

        return sb.toString();
    }
}
