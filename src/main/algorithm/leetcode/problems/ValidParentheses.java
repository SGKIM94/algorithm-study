package algorithm.leetcode.problems;

import java.util.Stack;

/**
 * leetcode
 * ValidParentheses
 * https://leetcode.com/problems/valid-parentheses/
 * level : easy
 */
public class ValidParentheses {
    public boolean isValid(String s) {

        String[] parentheses = s.split("");
        Stack<String> stack = new Stack<>();

        for (String parenthese : parentheses) {
            if (parenthese.equals("(") || parenthese.equals("{") || parenthese.equals("[")) {
                stack.push(parenthese);
                continue;
            }

            if (parenthese.equals(")") && stack.peek().equals("(")) {
                stack.pop();
            } else if (parenthese.equals("]") && stack.peek().equals("[")) {
                stack.pop();
            } else if (parenthese.equals("}") && stack.peek().equals("{")) {
                stack.pop();
            }

            return false;
        }

        return stack.empty();
    }
}
