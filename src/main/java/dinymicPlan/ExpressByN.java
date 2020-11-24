package java.dinymicPlan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ExpressByN {
    class Solution {
        private List<Integer> answers = new ArrayList<>();
        private int target;
        private int source;

        public int solution(int N, int number) {
            int answer = 0;
            source = N;
            target = number;

            countExpressTargetBySource(0, 0);

            if (answers.size() == 0) {
                return -1;
            }

            return Collections.min(answers);
        }

        public void countExpressTargetBySource(int result, int count) {
            if (count > 8) {
                return;
            }

            if (result == target) {
                answers.add(count);
                return;
            }

            String ofSource = String.valueOf(source);

            for (int i = 0; i < 8; i++) {
                int currentSource = Integer.parseInt(ofSource);
                int next = count + i + 1;

                countExpressTargetBySource(result + currentSource, next);
                countExpressTargetBySource(result - currentSource, next);
                countExpressTargetBySource(result * currentSource, next);
                countExpressTargetBySource(result / currentSource, next);

                ofSource = ofSource + source;
            }
        }
    }


    class Solution2 {
        HashSet<Integer> check = new HashSet<Integer>();
        ArrayList<Integer>[] cache = new ArrayList[9];

        public int add(int left, int right) {
            return left + right;
        }

        public int sub(int left, int right) {
            return left - right;
        }

        public int mul(int left, int right) {
            return left * right;
        }

        public int div(int left, int right) {
            if (right == 0) return 0;
            return left / right;
        }

        public void addCache(int digit, int ret) {
            if (!check.contains(ret)) {
                check.add(ret);
                cache[digit].add(ret);
            }
        }

        public void cal(int digit, int left, int right) {
            addCache(digit, add(left, right));
            addCache(digit, sub(left, right));
            addCache(digit, mul(left, right));
            addCache(digit, div(left, right));
        }


        public int solution(int N, int number) {

            int temp = N;
            for (int i = 1; i < 9; i++) {
                if (temp == number) return i;
                cache[i] = new ArrayList<Integer>();
                cache[i].add(temp);
                check.add(temp);
                temp *= 10;
                temp += N;
            }

            for (int digit = 1; digit < 9; digit++) {
                for (int i = 1; i < digit; i++) {
                    int j = digit - i;
                    for (int left : cache[i]) {
                        for (int right : cache[j]) {
                            cal(digit, left, right);
                            if (check.contains(number)) {
                                return digit;
                            }
                        }
                    }
                }
            }
            return -1;
        }
    }
}
