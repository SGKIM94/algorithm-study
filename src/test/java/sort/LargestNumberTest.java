package java.sort;

public class LargestNumberTest {
    @Test
    public void solution() {
        Sort2 solution7 = new Sort2();


        String solution = solution7.solution(new int[]{303, 30});

        System.out.println(solution);

        //then
        assertThat(solution).isEqualTo("30330");
    }
}
