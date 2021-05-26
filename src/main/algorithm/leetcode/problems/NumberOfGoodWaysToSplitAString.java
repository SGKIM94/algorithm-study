package algorithm.leetcode.problems;
/**
 * leetcode
 * Number of Good Ways to Split a String
 *  medium
 *  https://leetcode.com/problems/number-of-good-ways-to-split-a-string/
 */
public class NumberOfGoodWaysToSplitAString {
    public int numSplits(String s) {
        int[] rightCount = new int[26];
        int[] leftCount = new int[26];

        int rightDistinct = 0;
        int leftDistinct = 0;

        int sizeOfS = s.length();
        for (int i = 0; i < sizeOfS; i++) {
            rightCount[s.charAt(i) - 'a']++;

            if (rightCount[s.charAt(i) - 'a'] == 1) {
                rightDistinct++;
            }
        }

        int answer = 0;
        for (int i = 0; i < sizeOfS; i++) {
            leftCount[s.charAt(i) - 'a']++;

            if (leftCount[s.charAt(i) - 'a'] == 1) {
                leftDistinct++;
            }

            rightCount[s.charAt(i) - 'a']--;

            if (rightCount[s.charAt(i) - 'a'] == 0) {
                rightDistinct--;
            }

            if (leftDistinct == rightDistinct) {
                answer++;
            }
        }

        return answer;
    }
}
