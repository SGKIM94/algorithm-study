package java.sort;

import java.util.List;

public class NumberOfKTest {
    @Test
    public void solution() {
        NumberOfK solution = new NumberOfK();


        List<Integer> solution = solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});

        System.out.println(solution);

        //then
        assertThat(solution).isEqualTo(5);
    }
}
