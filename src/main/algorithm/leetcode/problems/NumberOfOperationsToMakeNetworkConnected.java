package algorithm.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/number-of-operations-to-make-network-connected/
 * Number of Operations to Make Network Connected
 * level: Medium
 */
public class NumberOfOperationsToMakeNetworkConnected {

    public int makeConnected(int n, int[][] connections) {
        int wires = connections.length;

        if (n - wires > 1) {
            return -1;
        }

        List<List<Integer>> adjective = new ArrayList<>();

        for (int index = 0; index < n; index++) {
            adjective.add(index, new ArrayList<>());
        }

        for (int[] connection : connections) {
            adjective.get(connection[0]).add(connection[1]);
            adjective.get(connection[1]).add(connection[0]);
        }

        boolean[] visited = new boolean[n];
        int count=0;

        for (int index = 0; index < n; index++) {
            if (!visited[index]) {
                count++;
                dfs(index, adjective, visited);
            }
        }

        return count - 1;
    }

    public void dfs(int index,List<List<Integer>> adjective, boolean[] visited){
        visited[index]=true;

        for (int element : adjective.get(index)) {
            if (!visited[element]) {
                dfs(element,adjective,visited);
            }
        }
    }
}
