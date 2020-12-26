package algorithm.programmers.dinymicPlan;

public class SteelMoney {
    class Solution {
        public int solution(int[] money) {
            int countOfHouse = money.length;

            int[] sumOfMoney1 = new int[countOfHouse];
            int[] sumOfMoney2 = new int[countOfHouse];

            sumOfMoney1[0] = money[0];
            sumOfMoney1[1] = money[0];

            sumOfMoney2[0] = 0;
            sumOfMoney2[1] = money[1];

            for (int i = 2; i < countOfHouse; i++) {
                sumOfMoney1[i] = calculateMoney(sumOfMoney1, i, money);
                sumOfMoney2[i] = calculateMoney(sumOfMoney2, i, money);
            }

            return Math.max(sumOfMoney1[countOfHouse - 2], sumOfMoney2[countOfHouse - 1]);
        }

        private int calculateMoney(int[] sumOfMoney2, int i, int[]  money) {
            return Math.max(money[i] + sumOfMoney2[i - 2], sumOfMoney2[i - 1]);
        }
    }
}
