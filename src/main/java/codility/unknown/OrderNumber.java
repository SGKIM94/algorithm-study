package java.codility.unknown;

public class OrderNumber {
    public int solution(int[] A) {
        int max = 0;

        for (int number : A) {
            int absNumber = Math.abs(number);

            if (absNumber / 10 > 0) {
                continue;
            }

            if (max < absNumber) {
                max = number;
            }
        }

        return max;
    }

}
