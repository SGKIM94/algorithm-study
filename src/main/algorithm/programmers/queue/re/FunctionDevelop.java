package algorithm.programmers.queue.re;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 프로그래머스
 * 스택 & 큐
 * FunctionDevelop
 */

public class FunctionDevelop {
    public int[] solution(int[] progresses, int[] speeds) {
        int sizeOfProgresses = progresses.length;

        Queue<Progress> queue = new ArrayDeque<>();
        for (int i = 0; i < sizeOfProgresses; i++) {
            queue.offer(new Progress(progresses[i], speeds[i]));
        }

        List<Integer> countOfDeploys = new ArrayList<>();

        while (!queue.isEmpty() && queue.peek() != null) {
            int countOfDeploy = 1;
            Progress currentProgress = queue.poll();

            int restOfDay = currentProgress.getDeployDay();

            while (!queue.isEmpty() && queue.peek() != null
                    && (queue.peek().calculateProgressAfterDay(restOfDay) >= 100)) {
                queue.poll();
                countOfDeploy++;
            }

            Queue<Progress> afterDayQueue = new ArrayDeque<>();
            while (!queue.isEmpty() && queue.peek() != null) {
                Progress progress = queue.poll();
                afterDayQueue.offer(new Progress(progress.calculateProgressAfterDay(restOfDay), progress.getSpeed()));
            }

            countOfDeploys.add(countOfDeploy);
            queue = afterDayQueue;
        }

        return countOfDeploys.stream().mapToInt(i -> i).toArray();
    }

    static class Progress {
        private int current;
        private int speed;

        Progress(int current, int speed) {
            this.current = current;
            this.speed = speed;
        }

        int getCurrent() {
            return current;
        }

        int getSpeed() {
            return speed;
        }

        int calculateProgressAfterDay(int day) {
            return this.current + (this.speed * day);
        }

        int getDeployDay() {
            int restOfDay = 100 - this.current;
            int day = restOfDay / this.speed;

            if (restOfDay % this.speed != 0) {
                return day + 1;
            }

            return day;
        }
    }
}
