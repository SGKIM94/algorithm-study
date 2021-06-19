package algorithm.leetcode.problems;

public class PalindromicSubstrings {
    private int response = 0;

    public int countSubstrings(String s) {
        char[] indexChar = s.toCharArray();

        for (int index = 0;index < indexChar.length; index++) {
            expand(indexChar,index,index);
            expand(indexChar,index,index+1);
        }

        return response;
    }

    public void expand(char[] indexChar, int left, int right){
        while (left >= 0 && right < indexChar.length) {
            if (indexChar[left] != indexChar[right]) {
                return;
            }

            response++;
            left--;
            right++;
        }
    }
}
