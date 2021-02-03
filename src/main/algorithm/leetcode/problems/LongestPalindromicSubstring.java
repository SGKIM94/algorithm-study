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

            if (!(depth < sizeOfs - 1 && start.equals(splited[depth + 1]))
                    && (appended.length() > longest.length())) {
                longest = appended;
                return;
            }
        }

        if (depth == sizeOfs - 1) {
            return;
        }

        palindrome(appended + next, start, splited[depth + 1], depth + 1, splited);
    }

    class Solution {
        public String longestPalindrome(String s) {

            if (s == null || "".equals(s)) {
                return s;
            }

            int len = s.length();

            String ans = "";
            int max = 0;

            boolean[][] dp = new boolean[len][len];

            for (int j = 0; j < len; j++) {

                for (int i = 0; i <= j; i++) {

                    boolean judge = s.charAt(i) == s.charAt(j);

                    dp[i][j] = j - i > 2 ? dp[i + 1][j - 1] && judge : judge;

                    if (dp[i][j] && j - i + 1 > max) {
                        max = j - i + 1;
                        ans = s.substring(i, j + 1);
                    }
                }
            }
            return ans;
        }
    }
}
