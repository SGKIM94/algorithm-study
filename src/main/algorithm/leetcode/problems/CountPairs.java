package algorithm.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode
 * CountPairs
 * level : medium
 */
public class CountPairs {
    public int countPairs(int[] deliciousness) {
        int countOfGoodMeals = 0;
        int sizeOfDeliciousness = deliciousness.length;

        if (sizeOfDeliciousness == 1) {
            return 0;
        }

        for (int i = 0; i < sizeOfDeliciousness; i++) {
            int firstDeliciousnes = deliciousness[i];

            for (int j = i; j < sizeOfDeliciousness; j++) {
                if (i == j) {
                    continue;
                }

                int secondDeliciousnes = deliciousness[j];

                if (isPowerOfTwo(firstDeliciousnes + secondDeliciousnes)) {
                    countOfGoodMeals++;
                }
            }
        }

        return countOfGoodMeals;
    }

    boolean isPowerOfTwo(int value) {
        return value == (value&-value);
    }

    private static int mod = 1_000_000_007;

    private static int[] twoSquare = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824};

    public static int countPairsAnswer(int[] deliciousness) {
        Map<Integer, Integer> pairs = new HashMap<>();

        int answer = 0;

        for (int deliciousnes : deliciousness) {

            for (int square : twoSquare) {
                int target = square - deliciousnes;
                int count = pairs.getOrDefault(target, 0);

                answer = (answer + count) % mod;
            }

            pairs.put(deliciousnes, pairs.getOrDefault(deliciousnes, 0) + 1);
        }

        return answer;
    }
}
