package algorithm.leetcode.problems;

/**
 * leetcode
 * UniquePathsTwo
 * level : medium
 * https://leetcode.com/problems/unique-paths-ii/
 */
public class UniquePathsTwo {
    public int uniquePathsWithObstacles(int[][] og) {
        int sizeOfOg = og.length;
        int sizeOfRowOg = og[0].length;

        int[][] dp = new int[sizeOfOg][sizeOfRowOg];

        int sizeOfDp = dp.length;
        for (int i = sizeOfDp - 1; i > -1; i--) {
            int sizeOfRowDp = dp[0].length;

            for (int j = sizeOfRowDp - 1; j > -1; j--) {
                if (og[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    if (i == sizeOfDp - 1 && j == sizeOfRowDp - 1) {
                        dp[i][j] = 1;
                    } else if (i == sizeOfDp - 1) {
                        dp[i][j] = dp[i][j + 1];
                    } else if (j == sizeOfRowDp - 1) {
                        dp[i][j] = dp[i + 1][j];
                    } else {
                        dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
                    }
                }
            }
        }

        return dp[0][0];
    }
}
