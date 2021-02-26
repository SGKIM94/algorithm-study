package algorithm.programmers.dinymicPlan;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class SteelMoneyTest {

    @Test
    public void solution() {
        SteelMoney.Solution steelMoney = new SteelMoney.Solution();
        int answer = steelMoney.solution(new int[]{1, 10});

        assertEquals(answer, is(10));
    }
}
