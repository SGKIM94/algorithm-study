package algorithm.leetcode.problems;

import java.util.*;

/**
 * https://leetcode.com/problems/insert-delete-getrandom-o1/
 * InsertDeleteGetNumber
 * medium
 */
public class InsertDeleteGetNumber {
    HashMap<Integer, Integer> stored;

    public boolean insert(int val) {
        if (stored.containsKey(val)) {
            return false;
        }

        stored.put(val, val);
        return true;
    }

    public boolean remove(int val) {
        if(stored.containsKey(val)){
            stored.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        Object[] values = stored.values().toArray();

        int max = values.length - 1;
        int min = 0;

        int random = min + (int)(Math.random() * ((max - min) + 1));

        return stored.get(values[random]);
    }
}
