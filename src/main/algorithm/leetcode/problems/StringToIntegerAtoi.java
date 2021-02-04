package algorithm.leetcode.problems;

/**
 * leetcode
 * StringToIntegerAtoi
 * level : easy
 */
public class StringToIntegerAtoi {
    public int myAtoi(String s) {
        String step1 = s.trim();

        if ("".equals(s)) {
            return 0;
        }

        boolean isPositive = true;
        if (step1.startsWith("-")) {
            isPositive = false;
            step1 = step1.replace("-", "");
        } else if (step1.startsWith("+")) {
            step1 = step1.replace("+", "");
        }

        if ("".equals(step1)) {
            return 0;
        }

        String[] words = step1.split("");
        StringBuilder digits = new StringBuilder();

        for (String word : words) {
            if (" ".equals(word)) {
                continue;
            }

            int asciiOfWord = word.charAt(0);

            if (asciiOfWord < 48 || asciiOfWord > 57) {
                break;
            }

            digits.append(word);
        }

        if (digits.length() == 0) {
            return 0;
        }

        int answer;

        try {
            answer = Integer.parseInt(digits.toString());
        } catch (NumberFormatException e) {
            if (!isPositive) {
                return Integer.MIN_VALUE;
            }

            return Integer.MAX_VALUE;
        }

        if (!isPositive) {
            return answer * -1;
        }

        return answer;
    }
}
