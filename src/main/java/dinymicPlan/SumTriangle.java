package java.dinymicPlan;

public class SumTriangle {
    class Solution {
        private int maxSum = 0;
        private int height;

        public int solution(int[][] triangle) {
            height = triangle.length;

            sumAllTriangle(triangle[0][0], 0, 0, triangle);

            return maxSum;
        }

        void sumAllTriangle(int sum, int index, int depth, int[][] triangle) {
            if (height == depth + 1) {
                if (maxSum < sum) {
                    maxSum = sum;
                }

                return;
            }

            int width = triangle[depth].length;
            int[] nextLine = triangle[depth + 1];

            sumAllTriangle(sum + nextLine[index], index, depth + 1, triangle);
            sumAllTriangle(sum + nextLine[index + 1], index + 1, depth + 1, triangle);
        }
    }
}

class Solution {
    private int sums[][];

    public int solution(int[][] triangle) {
        sums = new int[triangle.length][triangle.length];

        return sum(0, 0, triangle);
    }

    int sum(int depth, int index, int[][] triangle) {
        int currentSum = sums[depth][index];

        if (triangle.length == depth) {
            return 0;
        }

        if (currentSum > 0) {
            return currentSum;
        }

        int nextDepth = depth + 1;

        sums[depth][index]
                = triangle[depth][index] + Math.max(sum(nextDepth, index, triangle), sum(nextDepth, index + 1, triangle));

        return sums[depth][index];
    }
}


class Solution1 {
    private static int[][] nodes;
    private static int[][] nodesSum;

    public static int solution(int[][] triangle) {
        nodes = triangle;
        nodesSum = new int[triangle.length][triangle.length];
        return preOrder(0, 0);
    }

    private static int preOrder(int row, int col) {
        if (nodes.length == row) {
            return 0;
        }

        if (nodesSum[row][col] > 0) {
            return nodesSum[row][col];
        }

        nodesSum[row][col] = nodes[row][col] + Math.max(preOrder(row + 1, col), preOrder(row + 1, col + 1));

        return nodesSum[row][col];
    }

}
