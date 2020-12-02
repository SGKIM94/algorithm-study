package java.search;

import java.util.Arrays;

public class RemoveMinNumber {
    public int[] solution(int[] arr) {
        int arrSize = arr.length;

        if (arrSize <= 1) {
            return new int[]{-1};
        }

        int min = Arrays.stream(arr)
                .min()
                .getAsInt();

        return Arrays.stream(arr)
                .filter(value -> value != min)
                .toArray();
    }
}
