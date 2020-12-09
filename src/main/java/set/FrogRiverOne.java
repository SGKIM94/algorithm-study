package java.set;

import java.util.HashSet;
import java.util.Set;


/**
 * codility
 * Counting Elements
 * MaxCounters
 * level : easy
 */
class FrogRiverOne {
    public int solution(int X, int[] A) {
        int sizeOfPositions = A.length;

        if (sizeOfPositions < X) {
            return -1;
        }

        if (sizeOfPositions == 0) {
            return -1;
        }

        Set<Integer> positionOfLeaves = new HashSet<>();

        for (int time = 0; time < sizeOfPositions; time++) {
            if (A[time] <= X) {
                positionOfLeaves.add(A[time]);
            }

            if (positionOfLeaves.size() >= X) {
                return time;
            }
        }

        return -1;
    }
}
