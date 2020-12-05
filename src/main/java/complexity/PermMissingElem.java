package java.complexity;

import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A) {
        int sizeOfA = A.length;
        if (sizeOfA == 0) {
            return 1;
        }

        if (sizeOfA == 1) {
            return 2;
        }

        Arrays.sort(A);

        for (int i = 0; i < sizeOfA; i++) {
            int needNumber = i + 1;

            if (A[i] != needNumber) {
                return needNumber;
            }
        }

        throw new IllegalArgumentException("모든 수가 수열 구조입니다.");
    }
}
