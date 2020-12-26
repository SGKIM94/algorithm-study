package algorithm.programmers.search.binary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MathGiveup {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();

        int answersSize = answers.length;

        int [] firstAnswer = new int[]{1, 2, 3, 4, 5};
        int [] secondAnswer = new int[]{2, 1, 2, 3, 2, 4, 2, 5, 2, 1};
        int [] thirdAnswer = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Answer first = new Answer(1);
        Answer second = new Answer(2);
        Answer third = new Answer(3);

        for (int i = 0; i < answersSize; i++) {
            int index = i % 5;

            if (answers[i] == firstAnswer[index]) {
                first.addCount();
            }
        }

        for (int i = 0; i < answersSize; i++) {
            int index = i % 10;

            if (answers[i] == secondAnswer[index]) {
                second.addCount();
            }
        }

        for (int i = 0; i < answersSize; i++) {
            int index = i % 10;

            if (answers[i] == thirdAnswer[index]) {
                third.addCount();
            }
        }

        List<Answer> answerCounts = new ArrayList<>();
        answerCounts.add(first);
        answerCounts.add(second);
        answerCounts.add(third);

        Answer topAnswer = new Answer(1);
        for (int i = 0; i < answerCounts.size(); i++) {
            Answer currentAnswer = answerCounts.get(i);
            if (i == 0) {
                topAnswer = currentAnswer;
                answer.add(currentAnswer.getOrder());
                continue;
            }

            if (topAnswer.getCount() <= currentAnswer.getCount()) {
                answer.add(currentAnswer.getOrder());
            }
        }

        Collections.sort(answer);

        return answer;
    }


    static class Answer {
        private int count;
        private int order;

        Answer(int order) {
            this.count = 0;
            this.order = order;
        }

        int getCount() {
            return count;
        }

        int getOrder() {
            return order;
        }

        void addCount() {
            this.count++;
        }
    }
}
