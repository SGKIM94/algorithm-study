package algorithm.codility.unknown;

import java.util.HashSet;
import java.util.Set;

/**
 * codility
 * sort
 * Distinct
 * level : easy
 */
public class Distinct {
    public int solution(int[] A) {
        Set<Integer> answer = new HashSet<>();

        for (int integer : A) {
            answer.add(integer);
        }

        return answer.size();
    }
}
