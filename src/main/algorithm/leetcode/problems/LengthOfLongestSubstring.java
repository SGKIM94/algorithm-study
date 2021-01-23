package algorithm.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode
 * LengthOfLongestSubstring
 * level : medium
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if ("".equals(s)) {
            return 0;
        }

        String[] strings = s.split("");
        int sizeOfStrings = strings.length;

        if (sizeOfStrings == 1) {
            return 1;
        }

        List<String> current = new ArrayList<>();
        int longest = 0;
        for (String string : strings) {
            if (current.contains(string)) {
                int currentLength = current.size();
                current = new ArrayList<>();
                if (longest < currentLength) {
                    longest = currentLength;
                }
                continue;
            }

            current.add(string);
        }

        return longest;
    }
}
