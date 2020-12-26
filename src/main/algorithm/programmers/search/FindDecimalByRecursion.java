package algorithm.programmers.search;

import java.util.HashSet;
import java.util.Set;

public class FindDecimalByRecursion {
    static int answer = 0;
    static Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        char[] ofCharacters = numbers.toCharArray();
        boolean[] select = new boolean[numbers.length()];
        char[] output = new char[numbers.length()];

        for (int i = 0; i <= numbers.length(); i++) {
            perm(ofCharacters, select, output, 0, numbers.length(), i);
        }

        return answer;
    }


    public static void perm(char[] characters, boolean[] select, char[] output, int num, int size, int r) {
        if (num == r) {
            if (isPrime(output, r)) {
                answer++;
            }
            return;
        }

        for (int i = 0; i < size; i++) {
            if (select[i]) {
                continue;
            }

            select[i] = true;
            output[num] = characters[i];
            perm(characters, select, output, num + 1, size, r);
            select[i] = false;
        }
    }

    public static boolean isPrime(char[] arr, int size) {
        if (arr[0] == '0') {
            return false;
        }


        String str = "";
        for (int i = 0; i < size; i++) {
            str += arr[i];
        }

        int temp = Integer.parseInt(str);

        if (temp <= 1 || set.contains(temp)) {
            return false;
        }

        for (int i = 2; i * i <= temp; i++) {
            if (temp % i == 0) {
                return false;
            }
        }

        set.add(temp);
        return true;
    }
}
