package algorithm.programmers.hash;

import java.util.Arrays;

public class Maraton {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int sizeOfParticipant = participant.length;
        for (int i = 0; i < sizeOfParticipant; i++) {
            String person = participant[i];

            if (i == sizeOfParticipant - 1) {
                return person;
            }

            if (!person.equals(completion[i])) {
                return person;
            }
        }

        throw new RuntimeException();
    }
}
