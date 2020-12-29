package algorithm.programmers.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
