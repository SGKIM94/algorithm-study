package java.dinymicPlan;

public class RoadToSchool {
    class Solution {
        private static final int VALUE = 1_000_000_007;

        public int solution(int m, int n, int[][] puddles) {
            int[][] streets = new int[n][m];

            streets[0][0] = 1;

            for (int[] puddle : puddles) {
                streets[puddle[1] - 1][puddle[0] - 1] = -1;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (streets[i][j] == -1) {
                        streets[i][j] = 0;
                        continue;
                    }

                    if (i != 0) {
                        streets[i][j] += streets[i - 1][j] % VALUE;
                    }

                    if (j != 0) {
                        streets[i][j] += streets[i][j - 1] % VALUE;
                    }
                }
            }

            return streets[n - 1][m - 1] % VALUE;
        }
    }
}
