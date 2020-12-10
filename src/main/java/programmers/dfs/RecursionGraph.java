package java.programmers.dfs;

import java.util.ArrayList;
import java.util.LinkedList;

public class RecursionGraph {
    public void solution() {
        Graph graph = new Graph(10);

        graph.execute();
    }

    public static class Graph {
        private int count;
        private LinkedList<ArrayList<Integer>> adjacent;

        Graph(int count) {
            this.count = count;
            adjacent = new LinkedList<>();

            for (int i = 0; i < count; i++) {
                adjacent.add(new ArrayList<>());
            }
        }

        void dfs(int index, boolean[] visited) {
            visited[index] = true;

            for (int i = 0; i < adjacent.size(); i++) {
                Integer node = adjacent.get(index).get(i);

                if (!visited[node]) {
                    dfs(node, visited);
                }
            }
        }

        void execute() {
            boolean[] visited = new boolean[count];

            for (int i = 0; i < count; i++) {
                if (!visited[i]) {
                    dfs(i, visited);
                }
            }
        }
    }
}




