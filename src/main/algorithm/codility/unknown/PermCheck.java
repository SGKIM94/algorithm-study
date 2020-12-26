package algorithm.codility.unknown;

import java.util.Arrays;

/**
 * codility
 * Counting Elements
 * PermCheck
 * level : easy
 */
public class PermCheck {
    public int solution(int[] A) {
        int sizeOfA = A.length;

        Arrays.sort(A);

        for (int i = 0; i < sizeOfA; i++) {
            if (i + 1 != A[i]) {
                return 0;
            }
        }

        return 1;
    }
}
