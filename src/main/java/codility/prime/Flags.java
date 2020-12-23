package java.codility.prime;

import java.util.ArrayList;
import java.util.List;

/**
 * codility
 * Prime and composite numbers
 * Flags
 * level : medium
 * https://sustainable-dev.tistory.com/29
 * 문제에 대한 이해 부족
 * 반갑법(bisection) 찾아보기
 */
public class Flags {
    public int solution(int[] A) {
        int numberOfPeaks = 0;

        int before;
        int after;
        int beforePeak = 0;

        for (int i = 1; i < A.length - 1; i++) {
            before = A[i - 1];
            int current = A[i];
            after = A[i + 1];

            if (before < current && current > after && (Math.abs(beforePeak - i) >= numberOfPeaks)) {
                numberOfPeaks++;
                beforePeak = i;
            }
        }

        return numberOfPeaks;
    }

    // 반갑법(bisection)
    public int solution2(int[] A) {
        List<Integer> peekList = new ArrayList<>();

        for (int i=1; i<A.length-1; i++) {
            if (A[i] > A[i-1] && A[i] > A[i+1]) {
                peekList.add(i);
                i++;
            }
        }

        int maxFlagCount = 0;
        int start = 0;
        int end = peekList.size();

        if (end < 2) {
            return end;
        }

        while (start <= end) {
            int flag = (start + end) / 2;
            int count = 1;
            int prevIndex = peekList.get(0);

            for (int j=1; j<peekList.size() && count<flag; j++) {
                if (peekList.get(j) - prevIndex >= flag) {
                    count++;
                    prevIndex = peekList.get(j);
                }
            }

            if (count == flag) {
                start = flag + 1;
                maxFlagCount = count;
            } else {
                end = flag - 1;
            }
        }

        return maxFlagCount;
    }
}
