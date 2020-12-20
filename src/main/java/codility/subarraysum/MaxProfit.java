package java.codility.subarraysum;

/**
 * codility
 * Maximum slice Problem
 * MaxProfit
 * level : medium
 * https://sustainable-dev.tistory.com/25
 * 부분합(카데인알고리즘) 에 대한 공부 필요
 * https://juneyr.dev/2019-11-21/maximum-subarray
 */
public class MaxProfit {
    public int solution(int[] A) {
        int sizeOfA = A.length;
        int[] profit = new int[A.length];
        profit[0] = A[0];

        for (int i = 1; i < sizeOfA - 1; i++) {
            profit[i] = Math.max(0, (A[i] -A[i - 1])- profit[i - 1]);
        }

        int max = 0;
        for (int i = 0; i < sizeOfA - 1; i++) {
            max = Math.max(max, profit[i]);
        }

        return max;
    }

}
