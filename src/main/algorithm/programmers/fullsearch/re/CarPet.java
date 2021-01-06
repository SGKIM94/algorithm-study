package algorithm.programmers.fullsearch.re;

/**
 * 프로그래머스
 * 완전탐색
 * 카펫
 * level : 2단계
 */
public class CarPet {
    public int[] solution(int brown, int yellow) {
        int xy = yellow + brown;

        int x = 3;
        int y = 3;

        while (true) {
            if (x * y == xy && x >= y) {
                return new int[]{x, y};
            }

            if (x < brown) {
                x++;
                continue;
            }

            y++;
        }
    }
}
