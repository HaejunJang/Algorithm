package programmers.lv0.introduction;

public class Day13_3 {
    class Solution {
        public String solution(String cipher, int code) {
            String answer = "";
            int i =1;
            while (true) {
                if(code * i >cipher.length()) break;
                answer += String.valueOf(cipher.charAt(code * i -1));
                i++;
            }
            return answer;
        }
    }
}
