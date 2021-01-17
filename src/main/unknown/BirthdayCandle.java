package unknown;

import java.util.HashMap;
import java.util.Map;

/**
 * 생일 초가 10개 잇을 때
 * 만약 사용할 때 마다 부족하면 추가해주는 경우라면
 * 최소 추가해줘야 되는 개수는?
 * 참고로 6은 9로 대체가능
 */
public class BirthdayCandle {
    public int solution(int[] ages) {
        Map<Integer, Integer> candles = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                candles.put(6, 1);
                continue;
            }
            candles.put(i, 1);
        }

        // ages 를 확인하면서 감소시킨다.
        int needCandle = 1;

        for (int age : ages) {
            int sizeOfAge = (int) (Math.log10(age) + 1);

            int digit = 1;
            for (int i = 0; i < sizeOfAge; i++) {
                int number;
                number = age / digit;

                if (number == 9) {
                    number = 6;

                    int count = candles.get(number);
                    if (count == 0) {
                        candles = addCandles(candles);
                        needCandle++;
                    }

                    candles.put(number, candles.get(number) - 1);
                }

                digit *= 10;
            }
        }

        return needCandle;
    }

    private Map<Integer, Integer> addCandles (Map <Integer, Integer> candles){
        Map<Integer, Integer> newCancel = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int number;
            if (i == 9) {
                number = candles.get(6);
            } else {
                number = candles.get(i);
            }

            newCancel.put(i, number + 1);
        }

        return newCancel;
    }
}
