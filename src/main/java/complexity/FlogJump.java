package java.complexity;

public class FlogJump {
    public int solution(int X, int Y, int D) {
        if (X == Y) {
            return 0;
        }

        int BetwwenXAndY = Y - X;
        int minOfJump = BetwwenXAndY / D;

        if (BetwwenXAndY % D == 0) {
            return minOfJump;
        }
        return minOfJump + 1;
    }
}
