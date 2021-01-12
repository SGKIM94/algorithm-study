package unknown;

import java.util.ArrayList;
import java.util.List;

public class DPTree {
    public int solution(int n , int[] cars, int[][] links) {
        int [] countOfEdges = new int[n + 1];

        for (int i = 0; i < n - 1; i++) {
            countOfEdges[links[i][0]]++;
            countOfEdges[links[i][1]]++;
        }

        int lastLeaf = 0;
        int linkedLeaf = 0;

        for (int i = 0; i < n - 1; i++) {
            if (countOfEdges[i] == 1) {
                lastLeaf = i;
                break;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (links[i][0] == lastLeaf || links[i][1] == lastLeaf) {
                if (links[i][0] == lastLeaf) {
                    linkedLeaf = links[i][1];
                    break;
                }
                linkedLeaf = links[i][0];
                break;
            }
        }

        List<Integer> values = new ArrayList<>();
        int index = 0;
        values.add(cars[lastLeaf - 1]);
        boolean[] visited = new boolean[n];

        while (values.size() < n) {
            if (index == n - 1) {
                index = 0;
            }

            if (visited[index]) {
                index++;
                continue;
            }

            int[] link = links[index];

            if (linkedLeaf == link[0] || linkedLeaf == link[1]) {
                visited[index] = true;

                if (linkedLeaf == link[0]) {
                    values.add(cars[link[0] - 1]);
                    linkedLeaf = link[1];
                    index++;
                    continue;
                }

                values.add(cars[link[1] - 1]);
                linkedLeaf = link[0];
            }

            index++;
        }

        int totalSum = 0;
        for (int value : values) {
            totalSum += value;
        }

        int minSubtract = totalSum;

        for (Integer value : values) {
            int subtract = totalSum - value;
            if (minSubtract > subtract) {
                minSubtract = subtract;
            }
        }

        return minSubtract;
    }
}
