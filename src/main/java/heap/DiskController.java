package java.heap;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;
        // 대기하다가 시작하는 시간이 존재한다.
        // 따라서, 작업의 시간은 앞의 실행 노드가 끝났고,
        // 걸린시간은 앞 노드의 끝난 시간  + 소요시간 - (대기 시간)
        // 행 배열의 개수만큼 반복하면서 최종 종료시간이 가장 작은 것을 구한다.

        int jobsSize = jobs.length;
        int jobEndTime = 0;

        for (int i = 0; i < jobsSize; i++) {
            int[] job = jobs[i];

            if (i == 0) {
                jobEndTime = job[1] + job[0];
                continue;
            }

            jobEndTime = jobEndTime + job[1] - job[0];
        }

        return answer;
    }
}
