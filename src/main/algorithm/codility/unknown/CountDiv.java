package algorithm.codility.unknown;

/**
 * codility
 * Prefix Sum
 * CountDiv
 * level : medium
 */
public class CountDiv {
    public int solution(int A, int B, int K) {
        int maxOfQuotient = B / K;
        int minOfQuotient = calculateMinOfQuotient(A, K);

        return maxOfQuotient - minOfQuotient;
    }

    private int calculateMinOfQuotient(int A, int K) {
        int quotient = A / K;

        if (A % K == 0) {
            return quotient -1;
        }

        return quotient;
    }
}
