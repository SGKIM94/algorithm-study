package algorithm.programmers.heap.re;

import java.util.PriorityQueue;

/**
 * 프로그래머스
 * 힙
 * 더 맵게
 * level : 2단계
 * 최대 값 처리에 대해서 고민 필요
 * 테스트 케이스 3개를 맞추지 못했음
 */
public class Scovile {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int value : scoville) {
            queue.offer(value);
        }

        int countOfMix = 0;
        while (queue.size() > 2 && queue.peek() < K) {
            int minScoville = queue.poll();
            int secondMinScoville = queue.poll();

            int newScoville = minScoville + (secondMinScoville * 2);
            queue.offer(newScoville);
            countOfMix++;
        }

        int sizeOfRemainQueue = queue.size();
        if (sizeOfRemainQueue == 2) {
            int min = queue.poll();
            int secondMin = queue.poll();

            if (min + (secondMin * 2) >= K) {
                return countOfMix + 1;
            } else {
                return -1;
            }
        }

        if (sizeOfRemainQueue == 1 && queue.poll() >= K) {
            return countOfMix + 1;
        }

        return countOfMix;
    }
}
