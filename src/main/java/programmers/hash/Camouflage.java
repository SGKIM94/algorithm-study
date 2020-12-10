package java.programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            if (map.containsKey(clothe[1])) {
                map.put(clothe[1], map.get(clothe[1]) + 1);
                continue;
            }

            map.put(clothe[1], 1);
        }

        for (Integer integer : map.values()) {
            answer *= integer + 1;
        }

        return answer - 1;
    }
}
