package java.dinymicPlan;

import java.util.Arrays;

public class CardGame {
    int[][] dp;

    public int solution(int[] left, int[] right) {
        int answer;

        dp = new int[left.length][right.length];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        answer = recur(0, 0, left, right);

        return answer;
    }

    private int recur(int leftIndex, int rightIndex, int[] left, int[] right){
        if (leftIndex == left.length || rightIndex == right.length) {
            return 0;
        }

        if (dp[leftIndex][rightIndex] != -1) {
            return dp[leftIndex][rightIndex];
        }

        dp[leftIndex][rightIndex] = Math.max(recur(leftIndex + 1, rightIndex, left, right),
                recur(leftIndex+1, rightIndex+1, left, right));

        if (left[leftIndex] > right[rightIndex]) {
            dp[leftIndex][rightIndex] = Math.max(dp[leftIndex][rightIndex],
                    recur(leftIndex, rightIndex+1, left, right) + right[rightIndex]);
        }

        return dp[leftIndex][rightIndex];
    }
}
