package java.programmers.dinymicPlan;

public class GridPath {
    public int solution() {
        int[][] value = new int[][]{
                {3, 7, 9, 2, 7},
                {9, 8, 3, 5, 5},
                {1, 7, 9, 8, 5},
                {3, 8, 6, 4, 10},
                {6, 3, 9, 7, 8}
        };

        int rowSize = value.length;
        int colSize = value[0].length;

        int[][] cached = new int [rowSize][colSize];

        cached[0][0] = value[0][0];

        for (int row = 1; row < rowSize; row++) {
            cached[row][0] = cached[row - 1][0] + value[row][0];
        }

        for (int col = 1; col < colSize; col++) {
            cached[0][col] = cached[0][col - 1] + value[0][col];
        }

        for (int row = 1; row < rowSize; row++) {
            for (int col = 1; col < colSize; col++) {
                cached[row][col] = Math.max(value[row - 1][col], value[row][col - 1]);
            }
        }

        return cached[rowSize - 1][colSize - 1];
    }
}
