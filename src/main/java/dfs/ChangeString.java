package java.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChangeString {
    private String targetWord = "";
    private List<Integer> answers = new ArrayList<>();

    public int solution(String begin, String target, String[] words) {
        targetWord = target;
        boolean[] visited = new boolean[words.length];

        int checkCount = 0;
        for (String word : words) {
            if (word.equals(target)) {
                checkCount++;
            }
        }

        if (checkCount == 0) {
            return 0;
        }

        findTarget(begin, words, visited, 0, 0);

        if (answers.isEmpty()) {
            return 0;
        }

        return Collections.min(answers);
    }

    void findTarget(String word, String[] words, boolean[] visited, int depth, int index) {
        int wordsSize = words.length;

        if (word.equals(targetWord)) {
            answers.add(depth);
            return;
        }

        if (wordsSize == depth) {
            return;
        }

        for (int i = 0; i < wordsSize; i++) {
            String currentWord = words[i];

            if (isDifferentOnlyOneWord(currentWord, word)) {
                depth += 1;
                visited[depth] = true;
                findTarget(currentWord, words, visited, depth, i);
                depth -= 1;
                visited[depth] = false;
            }
        }
    }

    public boolean isDifferentOnlyOneWord(String firstWord, String secondWord) {
        if (firstWord.equals(secondWord)) {
            return false;
        }

        String[] splitedFirstWord = firstWord.split("");
        String[] splitedSecondWord = secondWord.split("");

        int wordSize = splitedFirstWord.length;
        int countOfDifferent = 0;

        for (int i = 0; i < wordSize; i++) {
            if (!splitedFirstWord[i].equals(splitedSecondWord[i])) {
                countOfDifferent++;
            }

            if (countOfDifferent > 1) {
                return false;
            }
        }

        return countOfDifferent == 1;
    }
}
