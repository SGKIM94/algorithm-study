package algorithm.leetcode.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-number-of-occurrences/
 * easy
 */
public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        boolean flag = true;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int number : arr) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();

        for (int number : map.values()) {
            if (!set.add(number)) {
                flag=false;
                break;
            }
        }

        return flag;
    }
}
