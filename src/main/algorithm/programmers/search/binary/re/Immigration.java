package algorithm.programmers.search.binary.re;


/**
 * 프로그래머스
 * 이분탐색
 * 입국심사
 * level : 3단계
 * 접근하지 못함
 * 조금 더 이해 필요
 * https://medium.com/@leeth0610/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%9D%B4%EB%B6%84%ED%83%90%EC%83%89-%EC%9E%85%EA%B5%AD%EC%8B%AC%EC%82%AC-3856b3975941
 */

public class Immigration {
    public int solution(int[] times, int n) {
        long answer = Long.MAX_VALUE;
        long left = 0;
        long right = 0;
        long mid;

        for (int time : times) {
            if (time > right) {
                right = time;
            }
        }

        // 모든 심사자가 최소 시간으로 입국심사 했을 때 걸리는 시간
        right *= n;

        while (left <= right) {
            long done = 0;
            mid = (left + right) / 2;

            // 중간의 시간을 모든 시간으로 나눈 것을 더한다.
            for (int time : times) {
                done += mid / time;
            }

            // 해당 시간동안 심사를 다 하지 못한 경우
            if (done < n) {
                left = mid + 1;
            } else {
                // 최소의 시간을 찾아야 하므로
                if (mid < answer) {
                    answer = mid;
                }

                right = mid - 1;
            }
        }

        return (int) answer;
    }
}
