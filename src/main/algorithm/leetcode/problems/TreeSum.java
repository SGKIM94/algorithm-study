package algorithm.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * leetcode
 * 3Sum
 * level : medium
 * https://leetcode.com/problems/3sum/
 */
public class TreeSum {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return ans;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            twoSum(nums, -nums[i], i + 1);
        }

        return ans;
    }

    void twoSum(int[] nums, int target, int start) {
        int i = start, j = nums.length - 1;

        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                ans.add(Arrays.asList(-target, nums[i], nums[j]));
                i++;
                j--;

                while (i < j && nums[i] == nums[i-1]) {
                    i++;
                }
            }
        }
    }
}
