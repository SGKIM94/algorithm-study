package algorithm.codility.queue;

import java.util.Stack;

/**
 * codility
 * Stack And Queue
 * Brackets
 * level : easy
 * https://stroot.tistory.com/104
 */
public class Brackets {
    public int solution(String S) {
        int sizeOfS = S.length();
        if (sizeOfS == 0) {
            return 1;
        }

        if (sizeOfS == 1) {
            return 0;
        }

        Stack<Character> parentheses = new Stack<>();

        for (int i = 0; i < sizeOfS; i++) {
            char parenthese = S.charAt(i);

            if (parenthese == '{' || parenthese == '[' || parenthese == '(') {
                parentheses.push(parenthese);
                continue;
            }

            if (parentheses.isEmpty()) {
                return 0;
            }

            char closeParenthese = parentheses.pop();

            if (parenthese == '}' && closeParenthese != '{') {
                return 0;
            }

            if (parenthese == ']' && closeParenthese != '[') {
                return 0;
            }

            if (parenthese == ')' && closeParenthese != '(') {
                return 0;
            }
        }

        if (!parentheses.isEmpty()) {
            return 0;
        }

        return 1;
    }
}
