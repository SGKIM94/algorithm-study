package algorithm.programmers.dfs;

public class Network {
    class Solution {
        public int solution(int n, int[][] computers) {
            int answer = 0;
            boolean[] visited = new boolean[n];

            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    findNetwork(computers, visited, 0);
                    answer++;
                }
            }

            return answer;
        }

        public void findNetwork(int[][] computers, boolean[] visited, int index) {
            visited[index] = true;
            int numberOfNetwork = computers.length;

            int[] computer = computers[index];

            for (int i = 0; i < numberOfNetwork; i++) {
                int node = computer[i];

                if (node == 1 && !visited[i]) {
                    findNetwork(computers, visited, i);
                }
            }
        }
    }
}




