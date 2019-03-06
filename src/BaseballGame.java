import java.util.*;
import java.io.*;


/*baseball	                                            return
[[123, 1, 1], [356, 1, 0], [327, 2, 0], [489, 0, 1]]	    2
* 질문한 세 자리의 수, 스트라이크의 수, 볼의 수를 담은 2차원 배열 baseball이 매개변수로 주어질 때, 가능한 답의 개수를 return 하도록 solution 함수를 작성해주세요.
*/

/*
 * 문제를 풀기 위한 Class
 */

public class BaseballGame<T, K> extends Argorithm {

    // 3s : 질의가 답인 경우다
    // 2s : 2개씩 묶음과 나머지 한개를 임의로 생성한 것이 답이다
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


    public int Solution(int[][] test_cases) {

        /*baseball	                                            return
        [[123, 1, 1], [356, 1, 0], [327, 2, 0], [489, 0, 1]]	    2
        */

        setTest_cases(test_cases);
        int [][] test_case = (int [][])getTest_cases();
        int size_of_testcase = test_case.length;

        int temp_count = 0;


        for(int i = 0; i < size_of_testcase; i++) {
            // 3s 인 경우
            if(test_case[i][1] == 3) {
                return 1;
            }
        }

        // 비교하기 위한 숫자들을 담기위한 List
        // 111 ~ 999 의 값 중에서 일치하는 값들을 제외시킨다
        // 123 과 비교하여 1s 1b이면 통과
        // 356과 비교해서 1s 0b이면 통과
        // 327과 비교해서 2s이면 통과
        // 489와 비교해서 0s 1b이면 통과.
        // 이런식으로 비교해가면서 전부 통과하면 추가하고
        // 중간에 통과하지 못하면 break 한다
        List<Integer> number = new ArrayList<>();

        //야구게임에서 가능한 제일 작은 숫자
        int min_value = 111;
        //야구게임에서 가능한 제일 큰 숫자
        int max_value = 999;

        for(int i = min_value; i < max_value; i++) {
                for(int j = 0; j < size_of_testcase; j++) {
                    // ball과 strike 개수를 샌다.
                    int [] strike_ball = checkStrikeAndBall(i, test_case[j][0]);
                }
        }

//        for(int i = 0;i < size_of_testcase; i++) {
//
//            int strike_add_ball = test_case[i][1] + test_case[i][2];
//
//            // 3b 인 경우
//            if(strike_add_ball == 3) {
//
//            }
//            // 2s인 경우
//            if(strike_add_ball == 2) {
//                //앞의 2자리 + 임의의 한자리
//                int temp_value = test_case[i][0];
//                temp_value = temp_value / 10;
//
//                for(int j = 0; j < 10; j++) {
//                    number.add(temp_value++);
//                }
//            }
//
//            // 1s인 경우
//            if(test_case[i][1] == 1) {
//                int temp_value = test_case[i][0];
//                temp_value = temp_value / 100;
//
//                if(test_case[i][2] == 0) {
//                    for(int j = 0; j < 100; j++) {
//
//                    }
//                }
//            }
//        }

        // 스트라이크의 가능성이 있는 숫자들만
        setAnswer(temp_count);
        return (int) getAnswer();
    }

    public int[] checkStrikeAndBall(int test_case, int temp_value) {
        // strike 개수와 ball 개수를 저장
        int [] strike_ball;
        // 임시 strike 개수 저장
        int temp_strike = 0;
        //임시 ball 개수 저장
        int temp_ball = 0;

        // 첫번째 자리의 숫자가 같은 경우
        if(test_case / 100 == temp_value / 100) {
            temp_strike++;
        }

        // 두번째 자리의 숫자가 같은 경우
        if((test_case % 100) / 10 == (temp_value % 100) / 10) {
            temp_strike++;
        }

        // 세번째 자리의 숫자가 같은 경우
        if((test_case % 100) % 10 == (temp_value % 100) % 10) {
            temp_strike++;
        }

        String string_temp_value = String.valueOf(temp_value);
        String string_test_case = String.valueOf(test_case);

        for(int i = 0; i < 3; i++) {
            if(!string_temp_value.contains(String.valueOf(string_test_case.charAt(i))))  {
                temp_ball++;
            }
        }

        strike_ball = new int[]{temp_strike, temp_ball};

        return strike_ball;
    }

}
