package java.dfs;

import java.util.LinkedList;

public class RecursionGraph {
    public void solution() {
        Graph graph = new Graph(10);

        graph.execute();
    }

    public static class Graph {
        private int count;
        private LinkedList<Integer>[] adjacent;

        Graph(int count) {
            this.count = count;
            adjacent = new LinkedList[count];

            for (int i = 0; i < count; i++) {
                adjacent[i] = new LinkedList<>();
            }
        }

        void dfs(int index, boolean[] visited) {
            visited[index] = true;

            for (int i = 0; i < adjacent.length; i++) {
                Integer node = adjacent[index].get(i);

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




