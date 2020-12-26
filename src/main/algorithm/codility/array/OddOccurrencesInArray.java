package algorithm.codility.array;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int sizeOfNumber = A.length;

        if (sizeOfNumber == 1) {
            return A[0];
        }

        Arrays.sort(A);

        int countOfNumber = 1;
        int prevNumber = A[0];

        for (int i = 1; i < sizeOfNumber; i++) {
            int number = A[i];

            if (isLastOfIndex(i, sizeOfNumber) && (prevNumber != number)) {
                return number;
            }

            if (number != prevNumber) {
                if (isNotPair(countOfNumber)) {
                    return prevNumber;
                }

                prevNumber = number;
                countOfNumber = 1;
                continue;
            }

            countOfNumber++;
        }

        throw new IllegalArgumentException("Wrong Array!");
    }

    boolean isNotPair(int countOfNumber) {
        return countOfNumber % 2 != 0;
    }

    boolean isLastOfIndex(int index, int sizeOfArray) {
        return index == sizeOfArray - 1;
    }
}
