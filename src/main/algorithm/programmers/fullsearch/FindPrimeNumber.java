package algorithm.programmers.fullsearch;

import java.util.ArrayList;
import java.util.List;

/**
 * 프로그래머스
 * 완전탐색
 * 소수찾기
 * level : 2단계
 */
public class FindPrimeNumber {
    public int solution(String numbers) {
        int answer = 0;

        String [] splitNumbers = numbers.split("");

        int numbersSize = splitNumbers.length;

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

        if (number == 2 || number == 3) {
            return true;
        }

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
