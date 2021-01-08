package algorithm.programmers.dfs.re;

/**
 * 프로그래머스
 * DFS
 * Network
 * level : 3단계
 * 2개의 케이스가 틀림
 * 확인 필요
 */
public class Network {
    public int solution(int n, int[][] computers) {
        boolean[] connecteds = new boolean[n];
        int numberOfConnected = 0;

        if (n == 1) {
            return 1;
        }

        for (int i = 0; i < n; i++) {
            int[] computer = computers[i];

            for (int j = 0; j < n; j++) {
                if (i == j || computer[j] == 0 || connecteds[j]) {
                    continue;
                }

                connecteds[j] = true;
                numberOfConnected++;
            }
        }

        return n - numberOfConnected + 1;
    }
}
