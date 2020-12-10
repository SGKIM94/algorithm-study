package java.codility.unknown;

/**
 * codility
 * Prefix Sum
 * PassingCars
 * level : easy
 * score : 100
 */
public class PassingCars {
    public int solution(int[] A) {
        int numberOfPassingCars = 0;
        int numberOfWest = 0;

        for (int value : A) {
            if (value == 0) {
                numberOfWest++;
            }

            if (value == 1) {
                numberOfPassingCars += numberOfWest;
            }

            if (numberOfPassingCars > 1_000_000_000) {
                return -1;
            }
        }

        return numberOfPassingCars;
    }
}
