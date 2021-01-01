package algorithm.programmers.queue.re;

import java.util.Stack;

public class StockPrice {
    public int[] solution(int[] prices) {
        int sizeOfPrices = prices.length;
        int[] answers = new int[sizeOfPrices];

        if (sizeOfPrices == 2) {
            if (prices[0] > prices[1]) {
                return new int[]{1, 0};
            }

            return new int[]{0, 0};
        }

        int second = 1;
        Stack<Integer> periodOfStockUp = new Stack<>();

        for (int i = 1; i < sizeOfPrices; i++) {
            periodOfStockUp.push(second);
            second++;

            if (prices[i] < prices[i - 1]) {
                for (int j = i; periodOfStockUp.isEmpty() && prices[j] > prices[i]; j--) {
                    periodOfStockUp.pop();
                }
            }
        }

        for (int i = 0; i < periodOfStockUp.size(); i++) {
            answers[i] = periodOfStockUp.pop();
        }

        return answers;
    }

    public int[] solution2(int[] prices) {
        int sizeOfPrices = prices.length;
        int[] answers = new int [prices.length];


        Stack<Stock> stocks = new Stack<>();
        stocks.push(new Stock(prices[0], 0));

        for (int i = 1; i < sizeOfPrices; i++) {
            int price = prices[i];

            while (!stocks.isEmpty() && stocks.peek().isDownPrice(price)) {
                Stock stockOfDown = stocks.pop();

                answers[stockOfDown.getIndex()] = i - stockOfDown.getIndex();
            }

            stocks.push(new Stock(i, prices[i]));
        }

        while (!stocks.isEmpty()) {
            Stock stock = stocks.pop();
            answers[stock.getIndex()] = sizeOfPrices - stock.getIndex();
        }

        return answers;
    }

    class Stock {
        private int cost;
        private int index;

        Stock(int cost, int index) {
            this.cost = cost;
            this.index = index;
        }

        int getIndex() {
            return index;
        }

        boolean isDownPrice(int price) {
            return this.cost < price;
        }
    }
}
