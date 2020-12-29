package algorithm.programmers.hash;

import java.util.Arrays;

/**
 * 프로그래머스
 * Hash
 * level : 2
 * startWith, indexOf 로 앞에 위치한 값을 검사할 수 있다.
 */

public class PhoneNumber {
    public boolean solution(String[] phone_book) {
        int sizeOfPhoneBook = phone_book.length;

        if (sizeOfPhoneBook == 1) {
            return false;
        }

        Arrays.sort(phone_book);

        for (int i = 0; i < sizeOfPhoneBook; i++) {
            String phone = phone_book[i];

            for (int j = i + 1; j < sizeOfPhoneBook; j++) {
                if (phone_book[j].startsWith(phone)) {
                    return false;
                }
            }
        }

        return true;
    }
}
