package algorithm.codility.fibonacci;

import java.util.*;

/**
 * codility
 * Fibonacci Numbers
 * FibFrog
 * level : medium
 * 문제에 대한 이해도 부족
 * 다시 한번 풀어봐야함
 * https://jackjeong.tistory.com/47
 */
public class FibFrog {
    final static Map<Integer, Integer> numbers = new HashMap<>();
    public int solution(int[] A) {
        int N = A.length;

        for (int i = 0; fibonacci(i) <= N + 1; i++) {
            fibonacci(i);
        }

        ArrayList<Integer> fibonaccis = new ArrayList<>();

        Collections.reverse(fibonaccis);
        boolean[] check = new boolean[N + 1];

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(-1 , 0));



        while (!queue.isEmpty()) {
            Point currentPoint = queue.poll();

            for (int number : fibonaccis) {
                int next = currentPoint.getX() + number;
                if (next == N) {
                    return currentPoint.getY() + 1;
                } else if (next < N && next >= 0) {
                    if (A[next] == 1 && !check[next]) {
                        check[next] = true;
                        Point point = new Point(next, currentPoint.y + 1);
                        queue.add(point);
                    }
                }
            }
        }

        return -1;
    }

    private int fibonacci(int number) {
        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        if (numbers.containsKey(number)) {
            return numbers.get(number);
        }

        numbers.put(number, fibonacci(number - 1) + fibonacci(number - 2));

        return numbers.get(number);
    }

    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
