package algorithm.codility.complexity;

public class FlogJump {
    public int solution(int X, int Y, int D) {
        if (X == Y) {
            return 0;
        }

        int BetweenXAndY = Y - X;
        int minOfJump = BetweenXAndY / D;

        if (BetweenXAndY % D == 0) {
            return minOfJump;
        }
        return minOfJump + 1;
    }
}
