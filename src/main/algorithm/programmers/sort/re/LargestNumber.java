package algorithm.programmers.sort.re;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 프로그래머스
 * 정렬
 * 가장 큰 수
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 * level : 2단계
 * collections.sort 에 대해서 정의하는 방법 공부 필요
 */
public class LargestNumber {
    public String solution(int[] numbers) {
        List<Number> numbersForSort = new ArrayList<>();
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        if (sum == 0) {
            return "0";
        }

        for (int value : numbers) {
            String number = String.valueOf(value);
            int needSize = 4 - number.length();

            number += "0".repeat(needSize);

            numbersForSort.add(new Number(value, Integer.parseInt(number)));
        }

        Collections.sort(numbersForSort);

        StringBuilder answer = new StringBuilder();
        for (Number number : numbersForSort) {
            int before = number.getBefore();

            answer.append(before);
        }

        return answer.toString();
    }

    static class Number implements Comparable<Number> {
        private int before;
        private int after;

        Number(int before, int after) {
            this.before = before;
            this.after = after;
        }

        int getBefore() {
            return before;
        }

        int getAfter() {
            return after;
        }

        @Override
        public int compareTo(Number number) {
            if (number.getAfter() == this.after) {
                return this.before - number.getBefore();
            }

            return number.getAfter() - this.after;
        }
    }
}
