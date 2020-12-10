package java.codility.unknown;

import java.util.Arrays;

/**
 * codility
 * Counting Elements
 * MissingInteger
 * level : medium
 */
public class MissingInteger {
    public int solution(int[] A) {
        int min = 1;

        Arrays.sort(A);

        for (int integer : A) {
            if (integer < 1) {
                continue;
            }

            if (min == integer) {
                min++;
            }

            if (integer > min) {
                return min;
            }
        }

        return min;
    }
}
