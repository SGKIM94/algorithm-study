package algorithm.programmers.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List<String> phones = new ArrayList<>();

        phones.add(phone_book[0]);

        for (int i = 1; i < sizeOfPhoneBook; i++) {
            String phone = phone_book[i];
            if (phones.indexOf(phone) == 0) {
                return false;
            }
        }

        return true;
    }

}
