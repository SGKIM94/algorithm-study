package algorithm.codility.stack;

import java.util.Stack;

public class StanWall {
    public int solution(int[] H) {

        Stack<Integer> pastH = new Stack<>();

        int cnt = 0;

        for(int i : H){
            while(!pastH.empty() && i < pastH.peek()){
                pastH.pop();
            }

            if(pastH.empty() || i > pastH.peek()){
                pastH.push(i);
                cnt++;
            }
        }
        return cnt;
    }
}
