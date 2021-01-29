package algorithm.leetcode.problems;

/**
 * leetcode
 * ReverseInteger
 * level : easy
 * string 사용하지 않고 풀어보기
 */
public class ReverseInteger {
    public int reverse(int x) {
        if (x < 10 && x > 0) {
            return x;
        }

        boolean isPositive = true;

        if (x < 0) {
            isPositive = false;
            x *= -1;
        }

        StringBuilder numbers = new StringBuilder(String.valueOf(x));
        numbers.reverse();

        long reversedNumber = Long.parseLong(numbers.toString());

        if (!isPositive) {
            return (int) (reversedNumber * -1);
        }

        return (int) reversedNumber;
    }

    class Solution {
        public int reverse(int x) {
            int rev = 0;
            while (x != 0) {
                int pop = x % 10;
                x /= 10;
                if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
                if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
                rev = rev * 10 + pop;
            }
            return rev;
        }
    }
}
