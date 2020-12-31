package algorithm.programmers.fullsearch;

import java.util.ArrayList;
import java.util.List;

public class MockExam {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int indexOfFirst = 0;
        int indexOfSecond = 0;
        int indexOfThird = 0;

        int[] countAnswers = new int[3];

        for (int answer : answers) {
            if (indexOfFirst == first.length) {
                indexOfFirst = 0;
            }

            if (indexOfSecond == second.length) {
                indexOfSecond = 0;
            }

            if (indexOfThird == third.length) {
                indexOfThird = 0;
            }

            if (first[indexOfFirst] == answer) {
                countAnswers[0]++;
            }

            if (second[indexOfSecond] == answer) {
                countAnswers[1]++;
            }

            if (third[indexOfThird] == answer) {
                countAnswers[2]++;
            }

            indexOfFirst++;
            indexOfSecond++;
            indexOfThird++;
        }

        int max = 0;
        for (int count : countAnswers) {
            if (count > max) {
                max = count;
            }
        }

        List<Integer> ofAnswers = new ArrayList<>();
        if (countAnswers[0] >= max) {
            ofAnswers.add(1);
        }

        if (countAnswers[1] >= max) {
            ofAnswers.add(2);
        }

        if (countAnswers[2] >= max) {
            ofAnswers.add(3);
        }

        return ofAnswers.stream().mapToInt(i -> i).toArray();
    }
}
