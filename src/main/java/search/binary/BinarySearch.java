package java.search.binary;

public class BinarySearch {
    public int solution(int[] arr, int iKey) {
        int mid;
        int left = 0;
        int right = arr.length - 1;
        int answer = 0;

        while (right >= left) {
            mid = (right + left) / 2;

            if (iKey == arr[mid]) {
                answer = iKey;
                break;
            }

            if (iKey < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}
