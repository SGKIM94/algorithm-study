package algorithm.programmers.search.binary;

import java.util.Arrays;

/**
 * 프로그래머스
 * 이분탐색
 * 입국심사
 * level : 3단계
 */
public class Immigration {
    public long solution(int n, int[] times) {
        Arrays.sort(times);

        int timesSize = times.length;

        if (timesSize > n) {
            return times[n -1];
        }

        int countOfJudge = 0;
        int[] judgeTimes = new int[timesSize];
        int currentTime = 0;

        while (n > countOfJudge) {
            int noWaitingIndex = findNoWaiting(judgeTimes);

            if (noWaitingIndex == -1) {
                judgeTimes = passSecond(judgeTimes);
                currentTime++;
                continue;
            }

            judgeTimes[noWaitingIndex] = times[noWaitingIndex];
            judgeTimes = passSecond(judgeTimes);

            countOfJudge++;
            currentTime++;
        }

        return currentTime;
    }

    int[] passSecond(int[] judgeTimes) {
        int sizeOfTimes = judgeTimes.length;

        for (int i = 0; i < sizeOfTimes; i++) {
            int time = judgeTimes[i];

            if (time != 0) {
                judgeTimes[i] = time - 1;
            }
        }

        return judgeTimes;
    }

    int findNoWaiting(int[] judgeTimes) {
        int sizeOfTimes = judgeTimes.length;
        for (int i = 0; i < sizeOfTimes; i++) {
            if (judgeTimes[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}
