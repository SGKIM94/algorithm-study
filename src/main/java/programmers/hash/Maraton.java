package java.programmers.hash;

import java.util.Arrays;

public class Maraton {
    public String solution(String[] participant, String[] completion) {
        int participantSize = participant.length;

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < participantSize; i++) {
            if (i == participantSize - 1) {
                return participant[i];
            }

            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return "wrong";
    }
}
