package java.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Scoville {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> scovilleHeap = new PriorityQueue<>();

        for (int value : scoville) {
            scovilleHeap.offer(value);
        }

        Arrays.sort(scoville);
        int scovilleSize = scoville.length;
        int maxMixScoville = scoville[scovilleSize - 2] + (scoville[scovilleSize - 1] * 2);
        if (maxMixScoville < K) {
            return -1;
        }

        int answer = 0;
        while (scovilleHeap.size() > 2 && scovilleHeap.peek() >= K) {
            Integer minScovile = scovilleHeap.poll();
            Integer secondMinScovile = scovilleHeap.poll();

            Integer mixScovile = minScovile + (secondMinScovile * 2);

            scovilleHeap.offer(mixScovile);

            answer++;
        }

        return answer;
    }
}
