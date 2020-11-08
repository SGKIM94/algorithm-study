package java.search;

import java.util.ArrayList;
import java.util.List;

public class FindDecimal {
    public int solution(String numbers) {
        int answer = 0;

        String [] splitNumbers = numbers.split("");

        int numbersSize = splitNumbers.length;

        // 1, 11, 17, 7, 71
        List<Integer> checkedNumber = new ArrayList<>();

        for (int i = 0; i < numbersSize; i++) {
            StringBuilder number = new StringBuilder(splitNumbers[i]);

            if (!checkedNumber.contains(Integer.parseInt(number.toString()))
                    && isPrime(Integer.parseInt(number.toString()))) {
                answer++;
            }

            checkedNumber.add(Integer.parseInt(number.toString()));

            for (int j = 0; j < numbersSize; j++) {
                if (i == j) {
                    continue;
                }

                number.append(splitNumbers[j]);

                if (!checkedNumber.contains(Integer.parseInt(number.toString()))
                        && isPrime(Integer.parseInt(number.toString()))) {
                    answer++;
                }

                checkedNumber.add(Integer.parseInt(number.toString()));
            }
        }

        return answer;
    }

    public boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
