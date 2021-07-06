package algorithm.leetcode.problems;

/**
 * https://leetcode.com/problems/fibonacci-number/
 * eash
 */
public class FibonacciNumberToDp {
    private int[] cache = new int[31];

    public int fibonacci(int N) {
        if (N <= 1) {
            return N;
        }

        if (cache[N] != 0) {
            return cache[N];
        }

        return cache[N] = fibonacci(N - 1) + fibonacci(N - 2);
    }
}
