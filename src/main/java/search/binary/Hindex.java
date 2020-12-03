package java.search.binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hindex {
    class Solution {
        public int solution(int[] citations) {
            Arrays.sort(citations);
            int citationsLength = citations.length;

            List<Integer> biggers = new ArrayList<>();

            for (int i = 1; i < 1001; i++) {
                int biggerThanIndexCount = 0;
                boolean flag = false;

                for (int j = 0; j < citationsLength; j++) {
                    if (i < citations[j]){
                        biggerThanIndexCount++;
                    }

                    if (biggerThanIndexCount > i) {
                        flag = true;
                        break;
                    }
                }

                if (!flag && (biggerThanIndexCount == i)) {
                    biggers.add(i);
                }
            }

            return Collections.max(biggers);
        }
    }
}
