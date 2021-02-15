package algorithm.leetcode.problems;

import java.util.Map;

/**
 * leetcode
 * RomanToInt
 * https://leetcode.com/problems/roman-to-integer/
 * level : easy
 */
public class RomanToInt {
    public int romanToInt(String s) {
        Map<Character, Integer> maps = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C',100, 'D', 500, 'M', 1000);

        int sizeOfS = s.length();
        int sum = maps.get(s.charAt(sizeOfS - 1));

        for (int index = sizeOfS - 2; index >= 0; index--) {
            char charAt = s.charAt(index);
            int roman = maps.get(charAt);

            if (maps.get(s.charAt(index + 1)) > roman) {
                sum -= roman;
            } else {
                sum += roman;
            }
        }

        return sum;
    }
}
