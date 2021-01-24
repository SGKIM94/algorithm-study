package algorithm.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode
 * LengthOfLongestSubstring
 * level : medium
 * subList 를 해주지 않아 dvdf 같은 케이스를 통과 못한 부분 수정
 */
public class LengthOfLongestSubstring {
    public static int solution(String s) {
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
                int index = current.indexOf(string);
                current = current.subList(index + 1, currentLength);

                if (longest < currentLength) {
                    longest = currentLength;
                }
            }

            current.add(string);
        }

        return Math.max(current.size(), longest);
    }
}
