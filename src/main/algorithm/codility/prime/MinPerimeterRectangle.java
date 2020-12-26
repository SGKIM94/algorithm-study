package algorithm.codility.prime;

/**
 * codility
 * Prime and composite numbers
 * MinPerimeterRectangle
 * level : easy
 * 통과하긴 했지만, 나눠지지 않을 때의 처리와 처리 순서를 어떤 것을 우선으로 했을 때
 * 더 효율적인지를 고민할 필요가 있음
 */
public class MinPerimeterRectangle {
    public int solution(int N) {
        int minimalOfPerimeter = N + 1;

        for (int i = 1; i < N; i++) {
            int height = N / i;
            int perimeter = i + height;

            if (i > height) {
                return minimalOfPerimeter * 2;
            }

            if (N % i != 0) {
                continue;
            }

            if (perimeter < minimalOfPerimeter) {
                minimalOfPerimeter = perimeter;
            }
        }

        return minimalOfPerimeter * 2;
    }
}
