package algorithm.codility.prime;

import java.util.ArrayList;
import java.util.List;


/**
 * codility
 * Prime and composite numbers
 * Peaks
 * level : medium
 * https://sustainable-dev.tistory.com/28
 * 효율성 테스트 실패
 * 먼저 peaks 에 해당하는 index 를 저장하고 그 index 를 각 block 마다 가지고 있는 경우
 * 해당 peaks 개수와 block 의 개수와 같으면 최대의 peaks 라고 생각하는 것이 중요
 *
 * 가능한 블럭의 수 중에 가장 '큰'블럭의 수 이므로 가능한 가장 큰 블럭의 수는
 * peak의 개수와 동일하기 때문에(모든 블럭에 peak이 하나씩 들어있다는 가정) 뒤에서부터 배분하도록 하였다.
 */
public class Peaks {
    public int solution(int[] A) {
        int N = A.length;

        if (N < 3) {
            return 0;
        }

        if (getNumberOfPeak(A) == 0) {
            return 0;
        }

        int maxOfBlocks = N / 3;
        int beforeUnit = 2;

        for (int unitOfDivided = 2; unitOfDivided < maxOfBlocks + 1; unitOfDivided++) {
            int sizeOfBlock = N / unitOfDivided;
            int numberOfPeak = 0;

            if (N % unitOfDivided != 0) {
                continue;
            }

            for (int j = 0; j < unitOfDivided; j++) {
                int startIndex = sizeOfBlock * j;
                int endIndex = (startIndex) + sizeOfBlock + 1;

                if (j == unitOfDivided - 1) {
                    endIndex = (startIndex) + sizeOfBlock;
                }

                for (int k = startIndex + 2; k < endIndex; k++) {
                    if (isPeak(A, k)) {
                        numberOfPeak++;
                    }
                }

                if (numberOfPeak == 0) {
                    return beforeUnit;
                }
            }

            beforeUnit = unitOfDivided;
        }

        return maxOfBlocks;
    }

        private int getNumberOfPeak(int[] A) {
            int N = A.length;
            int numberOfPeak = 0;

            for (int i = 2; i < N; i++) {

                if (isPeak(A, i)) {
                    numberOfPeak++;
                }
            }

            return numberOfPeak;
        }

    public int solution2(int[] A) {
        int N = A.length;

        if (N < 3) {
            return 0;
        }

        List<Integer> peaks = getPeaks(A);
        int numberOfPeaks = peaks.size();

        if (numberOfPeaks == 0) {
            return 0;
        }

        for (int unitOfDivided = numberOfPeaks; unitOfDivided >= 2; unitOfDivided--) {
            if (N % unitOfDivided != 0) {
                continue;
            }

            int sizeOfBlock = N / unitOfDivided;

            // peak 의 최대 개수는 블럭당 1개의 peak 을 가지는 것
            int block = 0;

            for (int peak : peaks) {
                int start = block * sizeOfBlock;
                int end = start + sizeOfBlock;

                if (peak >= start && peak < end) {
                    block++;
                }
            }

            if (block == unitOfDivided) {
                return unitOfDivided;
            }
        }

        return numberOfPeaks;
    }

    private List<Integer> getPeaks(int[] A) {
        List<Integer> peaks = new ArrayList<>();

        int N = A.length;
        for (int i = 2; i < N; i++) {

            if (isPeak(A, i)) {
                peaks.add(i);
            }
        }

        return peaks;
    }

    private boolean isPeak(int[] numbers, int index) {
        return numbers[index - 1] > numbers[index - 2] && numbers[index - 1] > numbers[index];
    }
}


