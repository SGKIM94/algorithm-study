package java.search;

public class Immigration {
    public long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;
        long left = 0;
        long mid;

        long right = max(times);

        right *= n;

        while (left <= right) {
            long done = 0;
            mid = (left + right) / 2;

            for (int time : times) {
                done += mid / time;
            }

            if (done < n) {
                left = mid + 1;
                continue;
            }

            if (mid < answer) {
                answer = mid;
            }

            right = mid - 1;
        }

        return answer;
    }

    private long max(int[] times) {
        long right = 0;

        for (int time : times) {
            if (time > right) {
                right = time;
            }
        }

        return right;
    }
}
