package algorithm.codility.abs;

import java.util.HashSet;
import java.util.Set;

/**
 * codility
 * sort
 * AbsDistinct
 * level : easy
 * https://app.codility.com/demo/results/trainingCW83UV-H2E/
 */
public class AbsDistinct {
    public int solution(int[] A) {
        Set<Integer> numbers = new HashSet<>();

        for (int number : A) {
            numbers.add(Math.abs(number));
        }

        return numbers.size();
    }
}
