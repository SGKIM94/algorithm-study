package algorithm.programmers.dfs.re;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 프로그래머스
 * DFS
 * 단어 변환
 * level : 3단계
 * 끝나는 조건, 즉 확인해야 할 부분은 target 과 현재 word 가 같은 경우에만임
 * visited 로 사용한 단어는 확인하지 않도록 하는 게 중요
 * visited 가 true 로 된 것은 다음 index 에서 다시 사용할 수 있도록 끝나면 false 변환해줘야함
 * visited 가 아닌 것과 단어가 한가지씩 다른 것만 재귀를 호출하기 때문에
 * 모든 단어를 한단어만 다른형태로 반복하지 않는 이상 재귀를 탈출할 수 있음
 */
public class ChangeWord {
    private String targetWord;
    private List<Integer> steps = new ArrayList<>();

    public int solution(String begin, String target, String[] words) {
        targetWord = target;

        int countOfSame = 0;
        for (String word : words) {
            if (word.equals(target)) {
                countOfSame++;
            }
        }

        if (countOfSame != 1) {
            return 0;
        }

        boolean[] visited = new boolean[words.length];
        dfs(words, visited, 0, begin);

        return Collections.min(steps);
    }

    public void dfs(String[] words, boolean[] visited, int depth, String word) {
        int sizeOfWords = words.length;
        if (word.equals(targetWord)) {
            steps.add(depth);
            return;
        }

        for (int i = 0; i < sizeOfWords; i++) {
            String currentWord = words[i];
            if (!visited[i] && isDifferentOneWord(currentWord, word)) {
                visited[i] = true;
                dfs(words, visited, depth + 1, currentWord);
                visited[i] = false;
            }
        }
    }

    private boolean isDifferentOneWord(String word, String beforeWord) {
        int sizeOfWord = word.length();

        int countOfDifferent = 0;
        for (int i = 0; i < sizeOfWord; i++) {
            if (word.charAt(i) != beforeWord.charAt(i)) {
                countOfDifferent++;
            }

            if (countOfDifferent > 1) {
                return false;
            }
        }

        return countOfDifferent == 1;
    }
}
