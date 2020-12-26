package algorithm.programmers.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfK {
    public List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> answers = new ArrayList<>();

        int commandSize = commands.length;
        if (array.length == 1) {
            for (int i = 0; i < commandSize; i++) {
                answers.add(array[0]);
            }

            return answers;
        }

        for (int[] command : commands) {
            int[] copiedArray = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(copiedArray);
            answers.add(copiedArray[command[2] - 1]);
        }

        return answers;
    }
}
