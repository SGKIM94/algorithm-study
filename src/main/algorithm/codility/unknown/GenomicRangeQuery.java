package algorithm.codility.unknown;

/**
 * codility
 * Prefix Sum
 * GenomicRangeQuery
 * level : medium
 * https://app.codility.com/programmers/lessons/5-prefix_sums/
 */
public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        String[] letters = S.split("");

        int sizeOfQuery = P.length;
        int[] answers = new int[sizeOfQuery];

        for (int i = 0; i < sizeOfQuery; i++) {
            int min = 'T';

            for (int j = P[i]; j < Q[i]; j++) {
                int currentLetter = letters[j].charAt(0);
                if (currentLetter == 1) {
                    min = 1;
                    break;
                }

                if (min > currentLetter) {
                    min = currentLetter;
                }
            }

            answers[i] = convertLettersToFactors(min);
        }

        return answers;
    }

    private int convertLettersToFactors(int letter) {;
        if (letter == 'A') {
            return 1;
        }

        if (letter == 'C') {
            return 2;
        }

        if (letter == 'G') {
            return 3;
        }

        if (letter == 'T') {
            return 4;
        }

        return -1;
    }

    public int[] solution2(String S, int[] P, int[] Q) {
        int sizeOfLetter = S.length() + 1;
        int[] aCount = new int[sizeOfLetter];
        int[] cCount = new int[sizeOfLetter];
        int[] gCount = new int[sizeOfLetter];

        int sizeOfDNA = P.length;
        int[] min = new int[sizeOfDNA];

        for (int i = 0; i < sizeOfDNA; i++) {
            aCount[i + 1] = aCount[i];
            cCount[i + 1] = cCount[i];
            gCount[i + 1] = gCount[i];

            char currentLetter = S.charAt(i);
            if (currentLetter == 'A') {
                aCount[i + 1]++;
            } else if (currentLetter == 'C') {
                cCount[i + 1]++;
            } else if (currentLetter == 'G') {
                gCount[i + 1]++;
            }
        }

        for (int j = 0; j < sizeOfDNA; j++) {
            int start = P[j];
            int end = Q[j];

            if (aCount[start] != aCount[end + 1]) {
                min[j] = 1;
            } else if (cCount[start] != cCount[end + 1]) {
                min[j] = 2;
            } else if (gCount[start] != gCount[end + 1]) {
                min[j] = 3;
            } else {
                min[j] = 4;
            }
        }

        return min;
    }
}
