package algorithm.leetcode.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/word-pattern/
 * easy
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");

        int sizeOfWords = words.length;
        if (sizeOfWords != pattern.length()) {
            return false;
        }

        Map<Character, String> dictionary = new HashMap<>();
        Set<String> ofWords = new HashSet<>();

        for (int i = 0; i < sizeOfWords; ++i) {
            char charOfIndex = pattern.charAt(i);

            if (!dictionary.containsKey(charOfIndex)) {
                if (!ofWords.add(words[i])) {
                    return false;
                }

                dictionary.put(charOfIndex, words[i]);

            } else if (!dictionary.get(charOfIndex).equals(words[i])) {
                return false;
            }
        }

        return true;
    }
}
