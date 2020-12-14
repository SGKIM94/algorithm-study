package java.codility.sort;

import java.util.Arrays;

/**
 * codility
 * sort
 * NumberOfDiscIntersections
 * level : medium
 * https://jobjava00.github.io/algorithm/codility/lesson6/NumberOfDiscIntersections/
 * https://hangaebal.blogspot.com/2016/06/algorithm-codility-lesson-6-sorting_27.html
 */
public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        int sizeOfA = A.length;

        long[] lower = new long[sizeOfA];
        long[] upper = new long[sizeOfA];

        for (int i = 0; i < sizeOfA; i++) {
            lower[i] = i - A[i];
            upper[i] = i + A[i];
        }

        Arrays.sort(lower);
        Arrays.sort(upper);

        int intersection = 0;
        int j = 0;

        for (int i = 0; i < sizeOfA; i++) {
            while (j < sizeOfA && upper[i] >= lower[j]) {
                intersection += j;
                intersection -= i;

                j++;
            }
        }

        if (intersection > 10_000_000) {
            return -1;
        }

        return intersection;
    }
}
