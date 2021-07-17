package algorithm.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://leetcode.com/problems/the-k-strongest-values-in-an-array/
 * The k Strongest Values in an Array
 */
public class KStrongestValues {
    public static int[] getStrongest(int[] array, int k) {
        Arrays.sort(array);

        int middle = array[((array.length - 1) / 2)];

        int[] kStrongest = new int[k];

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int number : array) {
            numbers.add(number);
        }

        numbers.sort((i1, i2) -> {
            int diff = Math.abs(i2 - middle) - Math.abs(i1 - middle);
            if (diff == 0) {
                return i2 - i1;
            }

            return diff;
        });

        for (int i = 0; i < k; i++) {
            kStrongest[i] = numbers.get(i);
        }

        return kStrongest;
    }
}
