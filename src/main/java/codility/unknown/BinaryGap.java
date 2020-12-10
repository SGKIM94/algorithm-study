package java.codility.unknown;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
    class Solution {
        public static final String TWO_OF_BINARY = "1";

        public int solution(int N) {
            String convertedToBinary = Integer.toBinaryString(N);
            String[] splitBinary = convertedToBinary.split("");

            List<Integer> indexOfOnes = new ArrayList<>();

            int sizeOfSplitBinary = splitBinary.length;
            for (int i = 0; i < sizeOfSplitBinary; i++) {
                if (TWO_OF_BINARY.equals(splitBinary[i])) {
                    indexOfOnes.add(i);
                }
            }

            int onesSize = indexOfOnes.size();
            if (haveNotBinaryGap(indexOfOnes.size(), splitBinary.length)) {
                return 0;
            }

            int maxOfBinaryGap = 0;
            int indexOfPrev = 0;
            for (int i = 1; i < onesSize; i++) {
                int indexOfOne = indexOfOnes.get(i);
                int binaryGap = (indexOfOne - indexOfPrev) - 1;

                if (binaryGap > maxOfBinaryGap) {
                    maxOfBinaryGap = binaryGap;
                }

                indexOfPrev = indexOfOne;
            }

            return maxOfBinaryGap;
        }

        private boolean haveNotBinaryGap(int sizeOfOnes, int binarysSize) {
            return sizeOfOnes == binarysSize || sizeOfOnes == 1;
        }
    }
}
