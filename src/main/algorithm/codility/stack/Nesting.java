package algorithm.codility.stack;

import java.util.Stack;

/**
 * codility
 * Stack And Queue
 * Nested
 * level : easy
 */
public class Nesting {
    public int solution(String S) {
        int sizeOfS = S.length();

        if (sizeOfS == 0) {
            return 1;
        }

        if (sizeOfS % 2 != 0) {
            return 0;
        }

        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < sizeOfS; i++) {
            if (S.charAt(i) == '(') {
                brackets.push('(');
                continue;
            }

            if (brackets.isEmpty() || brackets.pop() == null) {
                return 0;
            }
        }

        if (!brackets.isEmpty()) {
            return 0;
        }
        return 1;
    }
}
