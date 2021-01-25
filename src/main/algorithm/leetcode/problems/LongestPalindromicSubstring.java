package algorithm.leetcode.problems;

/**
 * leetcode
 * LongestPalindromicSubstring
 * level : medium
 */
public class LongestPalindromicSubstring {
    private String longest = "";
    private int sizeOfs = 0;

    public String longestPalindrome(String s) {
        sizeOfs = s.length();

        if (sizeOfs == 1) {
            return s;
        }

        String[] splited = s.split("");

        boolean isAllSame = true;
        for (int i = 1; i < sizeOfs; i++) {
            if (!splited[i].equals(splited[i - 1])) {
                isAllSame = false;
                break;
            }
        }

        if (isAllSame) {
            return s;
        }

        for (int i = 1; i < sizeOfs; i++) {
            palindrome(splited[i - 1], splited[i - 1], splited[i], i, splited);
        }

        if ("".equals(longest)) {
            return splited[0];
        }

        return longest;
    }

    private void palindrome(String appended, String start, String next, int depth, String[] splited) {
        if (start.equals(next)) {
            appended += next;

            if ((depth < sizeOfs - 1 && !start.equals(splited[depth + 1])) &&
                    (appended.length() > longest.length())) {
                longest = appended;
                return;
            }
        }

        if (depth == sizeOfs - 1) {
            return;
        }

        palindrome(appended + next, start, splited[depth + 1], depth + 1, splited);
    }
}
