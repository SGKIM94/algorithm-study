package algorithm.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;

/**
 * leetcode
 * Find the Longest Substring Containing Vowels in Even Counts
 * level : medium
 * https://leetcode.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/
 */
public class FindLongestSubstring {

    class Node {
        public boolean[] vowels;

        Node(boolean[] vowels){
            this.vowels = vowels;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Arrays.equals(vowels, node.vowels);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(vowels);
        }
    }

    public int findTheLongestSubstring(String S) {
        char[] chars = S.toCharArray();

        HashMap<Node, Integer> map = new HashMap<>();

        boolean[] vowels = new boolean[5];
        Arrays.fill(vowels, true);

        int maxLen = 0;

        String v = "aeiou";

        for (int i = 0; i < chars.length; i++) {
            int currentChar = v.indexOf(chars[i]);

            if (currentChar != -1) {
                vowels[currentChar] = !vowels[currentChar];
            }

            for (int j = 0; j <= vowels.length; j++) {
                if (j == vowels.length) {
                    maxLen = i+1;
                    break;
                }

                if (!vowels[j]) {
                    break;
                }
            }

            Node node = new Node(vowels);

            if (map.containsKey(node)) {
                maxLen = Math.max(maxLen, i - map.get(node));
            } else {
                map.put(node, i);
            }
        }

        return maxLen;
    }
}
