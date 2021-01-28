package algorithm.leetcode.problems;

/**
 * leetcode
 * PalindromeNumber
 * level : easy
 * string 사용하지 않고 풀어보기
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x > 0 && x < 10) {
            return true;
        }

        String[] numbers = String.valueOf(x).split("");
        int sizeOfNumbers = numbers.length;

        for (int i = 0; i < sizeOfNumbers / 2 + 1; i++) {
            if (!numbers[i].equals(numbers[(sizeOfNumbers - 1) - i])) {
                return false;
            }
        }

        return true;
    }
}
