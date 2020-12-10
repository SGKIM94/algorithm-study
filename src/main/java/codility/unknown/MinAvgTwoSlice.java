package java.codility.unknown;

/**
 * codility
 * Prefix Sum
 * MinAvgTwoSlice
 * level : medium
 * https://nukeguys.tistory.com/175
 */

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        int minIndex = 0;
        double minOfAverage = (A[0] + A[1]) / 2;

        int sizeOfA = A.length;
        for (int i = 2; i < sizeOfA; i++) {
            float average = (A[i - 1] + A[i]) / 2f;
            if (minOfAverage > average) {
                minOfAverage = average;
                minIndex = i - 1;
            }

            average = (A[i - 2] + A[i - 1] + A[i]) / 3f;
            if (minOfAverage > average) {
                minOfAverage = average;
                minIndex = i - 2;
            }
        }

        return minIndex;
    }
}
