package algorithm.programmers.fullsearch;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindPrimeNumberTest {
    @Test
    public void solution() {
        FindPrimeNumber findPrimeNumber = new FindPrimeNumber();
        int answer = findPrimeNumber.solution("17");

        assertThat(answer, is(3));

    }
}
