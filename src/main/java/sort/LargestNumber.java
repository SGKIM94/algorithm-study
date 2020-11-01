package java.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();

        List<String> convertedNumber = new ArrayList<>();
        for (int number : numbers) {
            convertedNumber.add(String.valueOf(number));
        }

        convertedNumber.sort((firstNumber, secondNumber)
                -> (firstNumber + secondNumber).compareTo(secondNumber + firstNumber));

        if ("0".equals(Collections.max(convertedNumber))) {
            return "0";
        }

        for (String number : convertedNumber) {
            answer.append(number);
        }

        return answer.toString();
    }
}
