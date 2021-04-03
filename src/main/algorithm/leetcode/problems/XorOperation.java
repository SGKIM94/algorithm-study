package algorithm.leetcode.problems;

/**
 * leetcode
 * https://leetcode.com/problems/xor-operation-in-an-array/
 * level : easy
 * https://leetcode.com/problems/xor-operation-in-an-array/
 */
public class XorOperation {
    public int solution(int start, int n) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            result = result ^ start + (2 * i);

        }

        return result;
    }
}
