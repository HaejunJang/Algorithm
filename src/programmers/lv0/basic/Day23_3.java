package programmers.lv0.basic;

public class Day23_3 {
    class Solution {
        public int solution(String myString, String pat) {
            int answer = 0;
            for(int i=0; i<myString.length(); i++) {
                if (i+pat.length() <=myString.length()) {
                    if (myString.substring(i,i+pat.length()).equals(pat)) answer++;
                }
            }
            return answer;
        }
    }

    /* 다른사람 코드 참고
    class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i=0; i<myString.length(); i++) {
            if (myString.substring(i).startsWith(pat)) answer++;
        }
        return answer;
    }
}
     */

}
