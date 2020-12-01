package java.dinymicPlan;

public class PedestrianHeaven {
    class Solution {
        private static final int MOD = 20170805;

        public int solution(int m, int n, int[][] cityMap) {
            int[][] rightRoad = new int[m + 1][n + 1];
            int[][] upRoad = new int[m + 1][n + 1];

            rightRoad[1][1] = 1;
            upRoad[1][1] = 1;

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    int roadStatus = cityMap[i - 1][j - 1];

                    if (isOneWay(roadStatus)) {
                        rightRoad[i][j] = rightRoad[i - 1][j];
                        upRoad[i][j] = rightRoad[i][j - 1];
                        continue;
                    }

                    if (isNoWay(roadStatus)) {
                        rightRoad[i][j] = 0;
                        upRoad[i][j] = 0;
                        continue;
                    }

                    if (isFreeWay(roadStatus)) {
                        rightRoad[i][j] += (upRoad[i][j - 1] + rightRoad[i - 1][j]) % MOD;
                        upRoad[i][j] += (upRoad[i][j - 1] + rightRoad[i - 1][j]) % MOD;
                    }
                }
            }

            return (rightRoad[m - 1][n] + upRoad[m][n - 1]) % MOD;
        }

        private boolean isFreeWay(int status) {
            return status == 0;
        }

        private boolean isNoWay(int status) {
            return status == 1;
        }

        private boolean isOneWay(int status) {
            return status == 2;
        }
    }
}
