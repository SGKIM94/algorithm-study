package algorithm.codility.unknown;

import java.util.Arrays;

/**
 * codility
 * sort
 * MaxProductOfThree
 * level : easy
 */
public class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);

        int sizeOfA = A.length;

        int sumOfStartIndex = A[0] * A[1];
        int sumOfLastIndex = A[sizeOfA - 3] * A[sizeOfA - 2];

        if (A[sizeOfA - 1] < 0) {
            return Math.min(sumOfLastIndex, sumOfStartIndex) * A[sizeOfA - 1];
        }


        return Math.max(sumOfStartIndex, sumOfLastIndex) * A[sizeOfA - 1];
    }
}
