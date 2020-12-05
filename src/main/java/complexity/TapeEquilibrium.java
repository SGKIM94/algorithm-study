package java.complexity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int sizeOfA = A.length;
        if (sizeOfA == 2) {
            int firstNumber = A[0];
            int secondNumber = A[1];

            int subtract = firstNumber - secondNumber;
            if (subtract < 0) {
                return subtract * -1;
            }

            return subtract;
        }

        PriorityQueue<Integer> subtracts = new PriorityQueue<>();

        for (int i = 1; i < sizeOfA; i++) {
            int sumOfLeft = sum(A, 0, i);
            int sumOfRight = sum(A, i, sizeOfA);

            int subtractBetweenSums = calculateAbsoluteSubtract(sumOfLeft, sumOfRight);

            if (subtractBetweenSums == 0) {
                return 0;
            }

            subtracts.offer(subtractBetweenSums);
        }

        return subtracts.peek();
    }

    int calculateAbsoluteSubtract(int left, int right) {
        int subtractBetweenSums = left - right;
        if (subtractBetweenSums < 0) {
            subtractBetweenSums *= -1;
        }

        return subtractBetweenSums;
    }

    int sum(int[] numbers, int startIndex, int endIndex) {
        int sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public int solutionAfterCheck(int[] A) {
        int sizeOfA = A.length;
        if (sizeOfA == 2) {
            int firstNumber = A[0];
            int secondNumber = A[1];

            int subsact = firstNumber - secondNumber;
            if (subsact < 0) {
                return subsact * -1;
            }

            return subsact;
        }

        int sum = 0;

        for (int number : A) {
            sum += number;
        }

        List<Integer> sums = new ArrayList<>();
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i < sizeOfA; i++) {
            leftSum += A[i - 1];
            rightSum = sum - leftSum;

            sums.add(Math.abs(rightSum - leftSum));
        }

        return Collections.min(sums);
    }
}
