package algorithm.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode
 * Degree of an array
 *  easy
 *
 *  https://leetcode.com/problems/degree-of-an-array/
 */
public class DegreeOfAnArray {
    public int findShortestSubArray(int[] numbers) {
        boolean havingMores = false;

        int degree = 1;

        Map<Integer, int[]> map = new HashMap<>();

        int sizeOfNumbers = numbers.length;
        for (int i = 0; i < sizeOfNumbers; i += 1) {
            int currentNumber = numbers[i];
            int[] currentNumbers = map.get(currentNumber);

            if (currentNumbers == null) {
                map.put(currentNumber, new int[]{1, i, i});
                continue;
            }

            currentNumbers[0] += 1;
            degree = Math.max(degree, currentNumbers[0]);
            currentNumbers[2] = i;
            havingMores = true;
        }

        if (!havingMores) {
            return 1;
        }

        int minLength = Integer.MAX_VALUE;

        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            int[] currentValue = entry.getValue();
            if (currentValue[0] == degree) {
                minLength = Math.min(minLength, currentValue[2] - currentValue[1] + 1);
            }
        }

        return minLength;
    }
}
