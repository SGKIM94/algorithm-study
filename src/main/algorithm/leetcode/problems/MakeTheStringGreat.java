package algorithm.leetcode.problems;

/**
 * leetcode
 * MakeTheStringGreat
 * level : easy
 * https://leetcode.com/problems/make-the-string-great/
 */

public class MakeTheStringGreat {
    public String makeGood(String s) {
        StringBuilder answer = new StringBuilder();

        int sizeOfS = s.length();
        for (int i = 0; i < sizeOfS; i++) {
            int sizeOfAnswer = answer.length();

            if (sizeOfAnswer == 0 || Math.abs((answer.charAt(sizeOfAnswer - 1) - s.charAt(i))) != 32) {
                answer.append(s.charAt(i));
            } else {
                answer.deleteCharAt(sizeOfAnswer - 1);
            }
        }

        return answer.toString();
    }
}
