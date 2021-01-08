package algorithm.programmers.dfs.re;

/**
 * 프로그래머스
 * DFS
 * TargetNumber
 * level : 2단계
 */
public class TargetNumber {
    private int sizeOfNumbers;
    private int targetNumber;

    public int solution(int[] numbers, int target) {
        sizeOfNumbers = numbers.length;
        targetNumber = target;

        return dfs(numbers, 0, 0);
    }

    private int dfs(int[] numbers, int sum, int depth) {
        if (depth == sizeOfNumbers) {
            if (targetNumber == sum) {
                return 1;
            }

            return 0;
        }

        depth++;

        return dfs(numbers, sum + numbers[depth - 1], depth)
                + dfs(numbers, sum - numbers[depth - 1], depth);
    }
}
