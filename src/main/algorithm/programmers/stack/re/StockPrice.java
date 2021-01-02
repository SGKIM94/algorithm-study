package algorithm.programmers.stack.re;

import java.util.Stack;

/**
 * 프로그래머스
 * Stack and Queue
 * 주식가격
 * level : 1단계
 * Stack / Queue 를 구현 할 때는 클래스 구현을 심히 고민
 */

public class StockPrice {
    public int[] solution(int[] prices) {
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
