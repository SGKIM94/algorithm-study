package algorithm.study.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoArray {
    public static final int MAX_SECOND = 100;

    public static void main(String[] args) {
        int[][] map = new int[3][3];
        List<List<Number>> maps =  new ArrayList<>();

        for (int i = 0; i < MAX_SECOND; i++) {
            int sizeOfRow = map.length;
            int sizeOfColumn = map[0].length;

            if (sizeOfRow >= sizeOfColumn) {
                maps = rCalculate(map);
            } else {
                maps = cCalculate(map);
            }
        }
    }

    static List<List<Number>> rCalculate(int[][] map) {
        int maxSizeOfColumn = 0;
        for (int[] ints : map) {
            int sizeOfColumn = ints.length;

            if (maxSizeOfColumn < sizeOfColumn) {
                maxSizeOfColumn = sizeOfColumn;
            }
        }

        int[][] sortedMap = new int[map.length][maxSizeOfColumn * 2];
        int[][] count = new int[map.length][maxSizeOfColumn];

        for (int row = 0; row < sortedMap.length; row++) {
            for (int column = 0; column < sortedMap[row].length; column++) {
                int value = map[row][column];
                count[row][value] = count[row][value] + 1;
            }
        }

        // 만들어진 count 를 기반으로 map 을 만든다.
        // 3 이 4 개 이런 식으로 생성됨
        List<List<Number>> numbers = new ArrayList<>();
        for (int row = 0; row < count.length; row++) {
            List<Number> rows = new ArrayList<>();

            for (int column = 0; column < count[row].length; column++) {
                if (count[row][column] == 0) {
                    continue;
                }

                // count 에 저장된 값들을 넣어주고 정렬을 한다.
                rows.add(new Number(column, count[row][column]));
            }

            Collections.sort(rows);
            numbers.add(rows);
        }

        return numbers;
    }

    static List<List<Number>> cCalculate(int[][] map) {
        int maxSizeOfColumn = 0;
        for (int[] ints : map) {
            int sizeOfColumn = ints.length;

            if (maxSizeOfColumn < sizeOfColumn) {
                maxSizeOfColumn = sizeOfColumn;
            }
        }

        int[][] sortedMap = new int[maxSizeOfColumn * 2][map[0].length];
        int[][] count = new int[maxSizeOfColumn][map[0].length];

        for (int row = 0; row < sortedMap.length; row++) {
            for (int column = 0; column < sortedMap[row].length; column++) {
                int value = map[row][column];
                count[row][value] = count[row][value] + 1;
            }
        }

        // 만들어진 count 를 기반으로 map 을 만든다.
        // 3 이 4 개 이1`런 식으로 생성됨
        List<List<Number>> numbers = new ArrayList<>();
        for (int[] ints : count) {
            List<Number> rows = new ArrayList<>();

            for (int column = 0; column < ints.length; column++) {
                if (ints[column] == 0) {
                    continue;
                }

                // count 에 저장된 값들을 넣어주고 정렬을 한다.
                rows.add(new Number(column, ints[column]));
            }

            Collections.sort(rows);
            numbers.add(rows);
        }

        return numbers;
    }

    static class Number implements Comparable<Number> {
        private int value;
        private int count;

        public Number(int value, int count) {
            this.value = value;
            this.count = count;
        }

        int getValue() {
            return value;
        }

        int getCount() {
            return count;
        }

        // count 의 오름 차순 ->
        // Number 의 오름 차순
        @Override
        public int compareTo(Number o) {
            // count 가 같은 경우는 value 의 오름 차순
            if (this.count == o.getCount()) {
                if (this.value > o.getValue()) {
                    return 1;
                }

                return -1;
            }

            // count 가 다른 경우는 count 가 큰 것이 우선 순위
            if (this.count > o.getCount()) {
                return 1;
            }

            return -1;
        }
    }
}
