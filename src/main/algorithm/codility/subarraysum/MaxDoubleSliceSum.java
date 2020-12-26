package algorithm.codility.subarraysum;

import java.util.Arrays;

/**
 * codility
 * Maximum slice Problem
 * MaxDoubleSliceSum
 * level : medium
 * https://sustainable-dev.tistory.com/25
 * 부분합(카데인알고리즘) 에 대한 공부 필요
 * https://juneyr.dev/2019-11-21/maximum-subarray
 */
public class MaxDoubleSliceSum {
    public int solution(int[] A) {
        int sizeOfA = A.length;

        if (sizeOfA < 4) {
            return 0;
        }

        int indexOfMin = min(A);
        int start = indexOfMin - 1;
        if (indexOfMin == 1) {
            start = 1;
        }

        int maxOfSum = 0;
        int sum = 0;
        if (indexOfMin != 0) {
            for (int i = indexOfMin - 1; i >= 1; i--) {
                sum += A[i];

                if (maxOfSum < sum) {
                    maxOfSum = sum;
                    start = i;
                }
            }
        }

        sum = 0;
        int end = sizeOfA - 3;
        maxOfSum = 0;

        if (indexOfMin != sizeOfA) {
            for (int i = indexOfMin + 1; i < sizeOfA - 1; i++) {
                sum += A[i];

                if (maxOfSum < sum) {
                    maxOfSum = sum;
                    end = i;
                }
            }
        }

        int[] arrayOfFront = Arrays.copyOfRange(A, start, indexOfMin);
        int[] arrayOfBack = Arrays.copyOfRange(A, indexOfMin + 1, end + 1);

        return sum(arrayOfFront) + sum(arrayOfBack);
    }

    public int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public int min(int[] numbers) {
        int min = numbers[0];
        int indexOfMin = 0;

        int sizeOfNumbers = numbers.length;
        for (int i = 0; i < sizeOfNumbers; i++) {
            int number = numbers[i];

            if (min > number) {
                min = number;
                indexOfMin = i;
            }
        }

        return indexOfMin;
    }


    public int solution2(int[] A) {
        int sizeOfA = A.length;

        if (sizeOfA == 3) {
            return 0;
        }

        int[] sumOfHead = new int[sizeOfA];
        int[] sumOfTail = new int[sizeOfA];


        for (int i = 1; i < sizeOfA; i++) {
            sumOfHead[i] = Math.max(0, sumOfHead[i - 1] + A[i]);
        }

        for (int i = sizeOfA - 2; i >= 1; i--) {
            sumOfTail[i] = Math.max(0, sumOfTail[i + 1] + A[i]);
        }

        int sumOfMax = 0;

        for (int i = 1; i < sizeOfA - 1; i++) {
            sumOfMax = Math.max(sumOfMax, sumOfHead[i - 1] + sumOfTail[i + 1]);
        }

        return sumOfMax;
    }

}
