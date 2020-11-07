package java.search;

public class FindDecimal {
    public int solution(String numbers) {
        int answer = 0;

        String [] splitNumbers = numbers.split("");

        int numbersSize = splitNumbers.length;
        int digit = 1;

        for (int i = 0; i < numbersSize; i++) {
            for (String splitNumber : splitNumbers) {
                StringBuilder number = new StringBuilder();

                for (int k = 0; k < digit; k++) {
                    number.append(splitNumber);
                }

                if (isPrime(Integer.parseInt(number.toString()))) {
                    answer++;
                }
            }

            digit++;
        }

        return answer;
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (i % Math.sqrt(number) == 0) {
                return false;
            }
        }

        return true;
    }
}
