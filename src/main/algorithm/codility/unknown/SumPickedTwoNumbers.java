package algorithm.codility.unknown;

import java.util.SortedSet;
import java.util.TreeSet;

public class SumPickedTwoNumbers {
    public int[] solution(int[] numbers) {
        SortedSet<Integer> sums = new TreeSet<>();

        int numbersSize = numbers.length;
        for (int i = 0; i < numbersSize - 1; i++) {
            for (int j = i; j < numbersSize; j++) {
                sums.add(numbers[i] + numbers[j]);
            }
        }

        return sums.stream().mapToInt(Integer::intValue).toArray();
    }
}
