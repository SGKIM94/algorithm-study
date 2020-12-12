package java.codility.leader;

import java.util.HashMap;
import java.util.Map;

public class Dominator {
    public int solution(int[] A) {
        int sizeOfA = A.length;

        if (sizeOfA == 0) {
            return -1;
        }

        Map<Integer, Integer> numbers = new HashMap<>();
        int keyOfMax = A[0];
        int indexOfMax = 0;

        if (sizeOfA == 1) {
            return 0;
        }

        for (int value : A) {
            numbers.put(value, numbers.getOrDefault(value, 0) + 1);
        }

        for (int i = 0; i < sizeOfA; i++) {
            int value = A[i];
            int count = numbers.get(value);

            if (count > numbers.get(keyOfMax)) {
                keyOfMax = value;
                indexOfMax = i;
            }
        }

        int maxCount = numbers.get(keyOfMax);

        if (sizeOfA / 2 >= maxCount) {
            return -1;
        }

        return indexOfMax;
    }
}
