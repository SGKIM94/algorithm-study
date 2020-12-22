package java.codility.subarraysum;

/**
 * codility
 * Maximum slice Problem
 * MaxSliceSum
 * level : easy
 */
public class MaxSliceSum {
    public int solution(int[] A) {
        int sizeOfA = A.length;

        if (sizeOfA == 1) {
            return A[0];
        }

        int[] sums = new int[sizeOfA];
        int sumOfMax = A[0];
        sums[0] = A[0];

        for (int i = 1; i < sizeOfA; i++) {
            sums[i] = Math.max(A[i], sums[i - 1] + A[i]);

            if (sums[i] > sumOfMax) {
                sumOfMax = sums[i];
            }
        }

        return sumOfMax;
    }
}
