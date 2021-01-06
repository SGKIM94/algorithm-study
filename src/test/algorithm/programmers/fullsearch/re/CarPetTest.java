package algorithm.programmers.fullsearch.re;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CarPetTest {

    @Test
    public void solution() {
        CarPet findPrimeNumber = new CarPet();
        int[] answer = findPrimeNumber.solution(10, 2);

        assertThat(answer[0], is(4));
        assertThat(answer[1], is(3));

    }

    @Test
    public void second_solution() {
        CarPet findPrimeNumber = new CarPet();
        int[] answer = findPrimeNumber.solution(8, 1);

        assertThat(answer[0], is(3));
        assertThat(answer[1], is(3));

    }

    @Test
    public void third_solution() {
        CarPet findPrimeNumber = new CarPet();
        int[] answer = findPrimeNumber.solution(24, 24);

        System.out.println(Arrays.toString(answer));

        assertThat(answer[0], is(8));
        assertThat(answer[1], is(6));

    }

}
