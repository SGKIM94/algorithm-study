package algorithm.leetcode.problems;

/**
 * leetcode
 * Ugly Number II
 * level : medium
 * https://leetcode.com/problems/ugly-number-ii/
 */
public class NthUglyNumber {
    public int nthUglyNumber(int n) {
        if (n < 5) {
            return n;
        }

        int[] answer = new int[n];
        int first = 0;
        int second = 0;
        int third = 0;

        answer[0] = 1;

        for (int i = 1; i < n; i++){
            answer[i] = Math.min(answer[first] * 2, Math.min(answer[second] * 3, answer[third] * 5));

            if (answer[i] == answer[first] * 2) {
                first++;
            }

            if (answer[i] == answer[second] * 3) {
                second++;
            }

            if (answer[i] == answer[third] * 5) {
                third++;
            }
        }

        return answer[n - 1];
    }
}
