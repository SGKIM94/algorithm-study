package algorithm.programmers.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class FunctionDevelop {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answers = new ArrayList<>();

        Queue<Deploy> deploys = new ArrayDeque<>();

        int progressesSize = progresses.length;
        for (int i = 0; i < progressesSize; i++) {
            deploys.add(new Deploy(progresses[i], speeds[i]));
        }

        while (!deploys.isEmpty()) {
            Deploy preceding = deploys.peek();
            int developDay = deploys.peek().calculateDevelopDay();

            deploys = deploys.stream()
                    .map(deploy -> deploy.addProgresses(developDay))
                    .collect(Collectors.toCollection(ArrayDeque::new));

            if (preceding.isProgressBiggerThan100()) {
                int deployCount = 0;

                while (!deploys.isEmpty() && deploys.peek().isProgressBiggerThan100()) {
                    preceding = deploys.poll();
                    deployCount++;
                }

                answers.add(deployCount);
            }
        }


        return answers;
    }

    static class Deploy {
        private int progresses;
        private int speeds;

        Deploy(int progresses, int speeds) {
            this.progresses = progresses;
            this.speeds = speeds;
        }

        boolean isProgressBiggerThan100() {
            return this.progresses >= 100;
        }

        Deploy addProgresses(int developDay) {
            this.progresses = this.progresses + (this.speeds * developDay);
            return this;
        }

        int calculateDevelopDay() {
            int developDay = (100 - this.progresses) / this.speeds;

            if (developDay == 0) {
                return 1;
            }

            return developDay;
        }
    }
}
