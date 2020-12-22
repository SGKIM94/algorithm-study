package java.codility.prime;

/**
 * codility
 * Maximum slice Problem
 * CountFactors
 * level : easy
 * https://sustainable-dev.tistory.com/26
 * 약수의 개수는 sqrt(제곱근)에 대한 약수의 개수의 2배와 동일하다(정수일 경우 + !)
 */
public class CountFactors {
    public int solution(int N) {
        if (N == 1) {
            return 1;
        }

        int numberOfFactors = 1;
        double sqrtOfN = Math.sqrt(N);

        for (int i = 2; i < sqrtOfN; i++) {
            if (N % i == 0) {
                numberOfFactors++;
            }
        }

        numberOfFactors = numberOfFactors * 2;

        if (sqrtOfN % 1 == 0) {
            return ++numberOfFactors;
        }

        return numberOfFactors;
    }
}
