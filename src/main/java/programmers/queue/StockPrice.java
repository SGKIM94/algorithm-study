package java.programmers.queue;

public class StockPrice {
    public int[] solution(int[] prices) {
        int pricesSize = prices.length;
        int[] answer = new int[pricesSize];


        if (pricesSize == 2) {
            return comparePriceByFirstAndSecond(prices[0], prices[1]);
        }


        for (int i = 0; i < pricesSize; i++) {
            if (i == pricesSize - 1) {
                answer[i] = 0;
                return answer;
            }

            for (int j = i + 1; j < pricesSize; j++) {
                if (prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                }

                if (j == pricesSize - 1) {
                    answer[i] = j - i;
                }
            }
        }

        return answer;
    }

    private int[] comparePriceByFirstAndSecond(int firstPrice, int secondPrice) {
        if (firstPrice > secondPrice) {
            return new int[]{0, 0};
        }

        return new int[]{1, 0};
    }
}
