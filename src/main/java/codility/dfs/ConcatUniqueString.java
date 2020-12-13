package java.codility.dfs;

import java.util.HashSet;
import java.util.Set;

public class ConcatUniqueString {
    public int solution(String[] A) {
        return dfs(A, "", 0);
    }

    private int dfs(String[] strings, String string, int start) {
        if (!isUnique(string)) {
            return 0;
        }

        int maxLength = string.length();

        int stringsLength = strings.length;
        for (int i = start; i < stringsLength; i++) {
            int length = dfs(strings, string + strings[i], i + 1);
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    private boolean isUnique(String string) {
        Set<Character> strings = new HashSet<>();

        for (char character : string.toCharArray()) {
            if (strings.contains(character)) {
                return false;
            }

            strings.add(character);
        }

        return true;
    }
}
