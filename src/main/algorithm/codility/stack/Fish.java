package algorithm.codility.stack;

import java.util.Stack;

/**
 * codility
 * Stack And Queue
 * Fish
 * level : easy
 * https://jobjava00.github.io/algorithm/codility/lesson7/Fish/
 */
public class Fish {
    public int solution(int[] A, int[] B) {
        Stack<Integer> downstreamFish = new Stack<>();

        int numberOfFish = A.length;
        int numberOfAliveFish = 0;

        for (int i = 0; i < numberOfFish; i++) {
            int sizeOfFish = A[i];
            int direction = B[i];

            if (direction == 1) {
                downstreamFish.push(sizeOfFish);
                continue;
            }

            while (!downstreamFish.isEmpty()) {
                if (downstreamFish.peek() > sizeOfFish) {
                    break;
                }

                downstreamFish.pop();
            }

            if (downstreamFish.isEmpty()) {
                numberOfAliveFish++;
            }
        }

        return numberOfAliveFish + downstreamFish.size();
    }
}
