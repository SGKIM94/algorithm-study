package java.programmers.sort;

public class LargestNumberTest {
    @Test
    public void solution() {
        LargestNumber solution = new LargestNumber();


        String solution = solution.solution(new int[]{303, 30});

        System.out.println(solution);

        //then
        assertThat(solution).isEqualTo("30330");
    }
}
