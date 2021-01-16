package unknown;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * x y 그래프에서 풍선을 레이저로 쐈을 때
 * 최소 몇개를 쏴야 다 터트릴 수 있는지
 * 기울기 같은 경우는 동시에 터트릴 수 있음
 * 0,0 에서 시작함
 */
public class XYLazer {
    public int solution(int[][] balloons) {
        Set<Position> positions = new HashSet<>();

        for (int[] balloon : balloons) {
            int x = balloon[0];
            int y = balloon[1];
            double angle;
            int quadrant;

            if (x > 0 && y > 0) {
                quadrant = 1;
            } else if (x < 0 && y > 0) {
                quadrant = 2;
            } else if (x < 0 && y < 0) {
                quadrant = 3;
            } else {
                quadrant = 4;
            }

            x = Math.abs(x);
            y = Math.abs(y);
            if (y == 0 || x == 0) {
                angle = 0;
            } else {
                angle = Math.toDegrees(Math.atan2(x, y));
            }

            positions.add(new Position(angle, quadrant));
        }

        return positions.size();
    }

    class Position {
        private double angle;
        private int quadrant;

        Position(double angle, int quadrant) {
            this.angle = angle;
            this.quadrant = quadrant;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position position = (Position) o;
            return angle == position.angle &&
                    quadrant == position.quadrant;
        }

        @Override
        public int hashCode() {
            return Objects.hash(angle, quadrant);
        }
    }
}
