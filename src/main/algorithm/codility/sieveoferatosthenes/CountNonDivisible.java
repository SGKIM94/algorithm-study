package algorithm.codility.sieveoferatosthenes;

/**
 * codility
 * sieve of Eratosthenes
 * CountNonDivisible
 * level : medium
 * https://sustainable-dev.tistory.com/31
 * 미리 해당 원소의 개수를 가지고 있는 배열을 만든 후,
 * 소수인 경우 해당 배열의 값을 더해주는 형태로 계산
 * 나머지가 0 인 것 뿐만 아니라 나눈 것의 값 또한
 * 개수를 구해야하는데, 배열에 중복되는 값이 존재할때는
 * 해당 원소의 개수를 가지는 cash 배열을 가지는 것이 좋은 듯
 */
public class CountNonDivisible {
    public int[] solution(int[] A) {
        int N = A.length;
        int[] nonDivisors = new int[N];

        for (int i = 0 ; i < N; i++) {
            nonDivisors[i] = countNonDivisors(A, A[i]);
        }

        return nonDivisors;
    }

    private int countNonDivisors(int[] numbers, int target) {
        int numberOfNonDivisors = 0;

        for (int number : numbers) {
            if (target < number) {
                numberOfNonDivisors++;
                continue;
            }

            if (target % number != 0) {
                numberOfNonDivisors++;
            }
        }

        return numberOfNonDivisors;
    }

    class Solution {
        public int[] solution(int[] A) {
            int N = A.length;
            int[] nonDivisors = new int[N];
            int[] countOfDivisors = new int[(N * 2) + 1];

            for (int number : A) {
                countOfDivisors[number]++;
            }

            for (int i = 0; i < N; i++) {
                int numberOfDivisors = 0;

                for (int j = 1; (j * j) <= A[i]; j++) {
                    if (A[i] % j == 0) {
                        numberOfDivisors += countOfDivisors[j];

                        if (A[i] / j != j) {
                            numberOfDivisors += countOfDivisors[A[i] / j];
                        }
                    }
                }

                nonDivisors[i] = N - numberOfDivisors;
            }

            return nonDivisors;
        }
    }
}
