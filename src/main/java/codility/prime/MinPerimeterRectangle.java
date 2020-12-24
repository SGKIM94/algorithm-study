package java.codility.prime;

/**
 * codility
 * Prime and composite numbers
 * MinPerimeterRectangle
 * level : easy
 */
public class MinPerimeterRectangle {
    public int solution(int N) {
        if (N == 1) {
            return 2;
        }

        int minimalOfPerimeter = (N + 1) * 2;

        for (int i = 1; i < N; i++) {
            int height = N / i;
            int perimeter = i + height;

            if (i > height) {
                return minimalOfPerimeter * 2;
            }

            if (perimeter < minimalOfPerimeter) {
                minimalOfPerimeter = perimeter;
            }
        }

        return minimalOfPerimeter * 2;
    }
}
