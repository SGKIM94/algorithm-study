import java.io.*;
import java.util.List;

/*baseball	                                            return
[[123, 1, 1], [356, 1, 0], [327, 2, 0], [489, 0, 1]]	    2
* 질문한 세 자리의 수, 스트라이크의 수, 볼의 수를 담은 2차원 배열 baseball이 매개변수로 주어질 때, 가능한 답의 개수를 return 하도록 solution 함수를 작성해주세요.
*/

/*
* 문제를 풀기 위한 Class
*/
public class NumberBaseball<T, K>{

    private T answer;
    private K test_cases;
    // 3s : 질의가 답인 경우다
    // 2s : 2개씩 묶음과 나머지 한개를 임의로 생성한 것이 답이고, .
    // 2s 1b : 질의가 답인 경우다
    // 1s : 1개의 자리 고정값을 고정으로 나머지 2개의 값을 임의로 생성한 것이 답이다.
    // 1s 1b ; 1개의 자리 고정값과 자리가 변경되는 1개의 값과 임의의 1개의 값으로 생성한 것이 답이다.
    // 1s 2b : 1개의 자리 고정값과 2개씩 묶음이 자리를 변경한 값이 답이다.
    // 1b : 1개의 자리가 변경되는 값과 임의로 생성된 2묶음의 값이 답이다.
    // 2b : 2개의 자리가 변경되는 값과 임의로 생성된 1개의 값이 답이다.
    // 3b : 3개의 값을 자리를 변경하여 생성한 것이 답이다.
    // 0s 0b : 3개의 값은 답에 포함되지 않는다.
    // 스트라이크가 있는 것들을 비교해서 같은 자리수에 같은 값과 그 갯수가 같은 것을 우선적으로 체크한다.
    // 예) {123, 1, 0} , {145, 1, 0} 인 경우 1은 똑같은 자리에 똑같은 숫자를 가지고 같은 s 개수이므로 항상 옳다
    // 정확한 값을 구하는 것이 아니라 맞는 개수를 구하는 것이므로 모든 값을 비교해 봐야한다.
    // 전체의 가능성 값 중에 조건이 부합하는 값을 찾는 것.
    // 그 자리 수에 어떤 값이 들어가 있는지 알 수 있으면 좋을 것 같음.


    public T getAnswer() {
        return answer;
    }
    public void setAnswer(T answer) {
        this.answer = answer;
    }
    public K getTest_cases() {
        return test_cases;
    }
    public void setTest_cases(K test_cases) {
        this.test_cases = test_cases;
    }

    public T NumberBaseball(K test_cases) {

        setTest_cases(test_cases);
        int [][] test_case = (int [][])getTest_cases();

        if(test_case[1][0] == 1) {

        }
        return getAnswer();
    }
}
