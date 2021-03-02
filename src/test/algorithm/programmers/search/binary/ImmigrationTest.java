package algorithm.programmers.search.binary;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ImmigrationTest {
    @Test
    public void immigration() {
        Immigration immigration = new Immigration();

        long solution = immigration.solution(3, new int[]{1, 2});

        assertThat(solution, is(3));
    }
}
