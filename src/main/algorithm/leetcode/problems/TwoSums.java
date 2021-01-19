package algorithm.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode
 * TwoSums
 * level : easy
 */
public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        int sizeOfNum = nums.length;

        if (sizeOfNum == 2) {
            return new int[]{0, 1};
        }

        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < sizeOfNum; i++) {
            numbers.put(nums[i], i);
        }

        for (int i = 0; i < sizeOfNum; i++) {
            Integer indexOfTarget = numbers.get(target - nums[i]);

            if (indexOfTarget != null && indexOfTarget != i) {
                return new int[]{i, indexOfTarget};
            }
        }

        throw new IllegalArgumentException();
    }
}
