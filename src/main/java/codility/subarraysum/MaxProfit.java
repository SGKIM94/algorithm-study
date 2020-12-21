package java.codility.subarraysum;

/**
 * codility
 * Maximum slice Problem
 * MaxProfit
 * level : easy
 * https://sustainable-dev.tistory.com/22
 * 부분합(카데인알고리즘) 에 대한 공부 필요
 * https://sustainable-dev.tistory.com/23
 */
public class MaxProfit {
    public int solution(int[] A) {
        int sizeOfA = A.length;

        if (sizeOfA == 0 || sizeOfA == 1) {
            return 0;
        }

        int minProfit = A[0];
        int maxProfit = 0;

        for (int i = 1; i < sizeOfA; i++) {
            int profit = A[i] - minProfit;

            if (A[i] < minProfit) {
                minProfit = A[i];
            }

            maxProfit = Math.max(maxProfit, profit);
        }

        return Math.max(maxProfit, 0);
    }
}
