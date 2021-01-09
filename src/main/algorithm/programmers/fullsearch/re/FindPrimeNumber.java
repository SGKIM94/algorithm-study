package algorithm.programmers.fullsearch.re;

import java.util.HashSet;
import java.util.Set;

/**
 * 프로그래머스
 * 완전탐색
 * 소수찾기
 * level : 2단계
 * 순열 검색으로 다시 풀어보자
 */
public class FindPrimeNumber {
    public int solution(String numbers) {
        int lengthOfNumbers = numbers.length();
        Set<Long> answers = new HashSet<>();

        for (int i = 0; i < lengthOfNumbers; i++) {
            String number = Character.toString(numbers.charAt(i));

            for (int j = 0; j < lengthOfNumbers; j++) {
                if (i == j) {
                    long oneDigit = Long.parseLong(Character.toString(numbers.charAt(i)));

                    if (isPrime(oneDigit)) {
                        answers.add(oneDigit);
                    }

                    continue;
                }

                number += numbers.charAt(j);
                long addParseNumber = Long.parseLong(number);

                if (isPrime(addParseNumber)) {
                    answers.add(addParseNumber);
                }
            }
        }

        return answers.size();
    }

    private boolean isPrime(long number) {
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

        System.out.println(number);

        return true;
    }
}
