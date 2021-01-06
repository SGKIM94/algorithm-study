package algorithm.programmers.fullsearch.re;

/**
 * 프로그래머스
 * 완전탐색
 * 카펫
 * level : 2단계
 * (x * 2) + ((y - 2) * 2) = 겉표면;
 * (x - 2) * (y - 2) = 중심 값;
 * x 가 더 커야하니까 최대를 기준으로 잡고 작업한다.
 * 따라서 x 는 하나 씩 증가하고 y 는 하나씩 감소한다.
 */
public class CarPet {
    public int[] solution(int brown, int yellow) {
        int sum = (brown + 4) / 2;

        int y = 3;
        int x = sum - y;

        while (true) {
            if ((x - 2) * (y - 2) == yellow) {
                return new int[]{x, y};
            }

            y++;
            x--;
        }
    }
}
