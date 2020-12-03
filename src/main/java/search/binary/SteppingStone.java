package java.search.binary;

import java.util.Arrays;

public class SteppingStone {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);

        int left = 1;
        int right = distance;

        int answer = 0;

        while (left <= right) {
            int countOfRemoveRocks = 0;
            int prev = 0;
            int minDistance = (left + right) / 2;


            for (int rock : rocks) {
                if ((rock - prev) < minDistance) {
                    countOfRemoveRocks++;
                } else {
                    prev = rock;
                }
            }

            if (distance - prev < minDistance) {
                countOfRemoveRocks++;
            }

            if (countOfRemoveRocks <= n) {
                answer = Math.max(answer, minDistance);
                left = minDistance + 1;
            } else {
                right = minDistance - 1;
            }
        }

        return answer;
    }
}
