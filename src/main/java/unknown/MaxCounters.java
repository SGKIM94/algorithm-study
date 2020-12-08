package java.unknown;

/**
 * codility
 * Counting Elements
 * MaxCounters
 * level : medium
 */
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] answers = new int[N];
        int currentMax = 0;
        int lastOfMax = 0;

        for (int value : A) {
            if (value == N + 1) {
                lastOfMax = currentMax;
                continue;
            }

            int index = value - 1;
            if (index < lastOfMax) {
                answers[index] = lastOfMax + 1;
            } else {
                answers[index]++;
            }

            if (answers[index] > currentMax) {
                currentMax = answers[index];
            }
        }

        for (int i = 0; i < N; i++) {
            if (answers[i] < lastOfMax) {
                answers[i] = lastOfMax;
            }
        }

        return answers;
    }
}
