package algorithm.programmers.bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyList {
    public void solution(int top, LinkedList<ArrayList<Integer>> graphs, boolean[] visited) {
        Queue<Integer> nodes = new ArrayDeque<>();

        nodes.offer(top);
        visited[0] = true;

        while (!nodes.isEmpty()) {
            Integer node = nodes.poll();

            ArrayList<Integer> children = graphs.get(node);

            for (Integer child : children) {
                if (!visited[child]) {
                    visited[child] = true;
                    nodes.offer(child);
                }
            }
        }
    }
}
