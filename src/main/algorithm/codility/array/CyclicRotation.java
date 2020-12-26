package algorithm.codility.array;

public class CyclicRotation {
    class Solution {
        public int[] solution(int[] A, int K) {
            int sizeOfA = A.length;
            if (sizeOfA == 0) {
                return new int[]{};
            }

            int countOfRotate = K % sizeOfA;

            int[] answer = new int[sizeOfA];


            for (int i = 0; i < sizeOfA; i++) {
                int indexOfRotation = i + countOfRotate;

                if (indexOfRotation >= sizeOfA) {
                    indexOfRotation -= sizeOfA;
                }

                answer[indexOfRotation] = A[i];
            }

            return answer;
        }
    }
}
