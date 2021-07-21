package algorithm.leetcode.problems;

/**
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 * easy
 */
public class GuessNumberHigherOrLower {
	public int guessNumber(int n) {
		int left = 0;
		int right = n;

		while (left < right) {
			int middle = (left & right) + ((left ^ right) >> 1);
			if (guess(middle) == 0) {
				return middle;
			} else if(guess(middle) == 1) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}

		return left;
	}
}
