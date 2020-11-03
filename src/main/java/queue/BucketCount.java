package java.queue;

import java.util.ArrayList;
import java.util.List;

public class BucketCount {
    public int solution(int[][] board, int[] moves) {
        Bucket bucket = new Bucket();

        int boardSize = board[0].length;

        for (int move : moves) {
            for (int i = 0; i < boardSize; i++) {
                int character = board[i][move - 1];

                if (character != 0) {
                    bucket.checkBeforeCharacter(character);
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }


        return bucket.submitPopCount();
    }

    public static class Bucket {
        private List<Integer> bucket;
        private int popCount = 0;

        Bucket() {
            bucket = new ArrayList<>();
        }

        void checkBeforeCharacter(int character) {
            if (bucket.size() == 0) {
                this.bucket.add(character);
                return;
            }

            if (this.bucket.get(bucket.size() - 1) == character) {
                this.popCount = this.popCount + 2;
                this.bucket.remove(bucket.size() - 1);
                return;
            }

            this.bucket.add(character);
        }

        int submitPopCount() {
            return this.popCount;
        }
    }
}
