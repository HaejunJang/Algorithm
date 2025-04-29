package programmers.lv0.basic;

public class Day3_1 {
    class Solution {
        public String solution(String str1, String str2) {
            String answer = "";
            for(int i=0; i<str1.length();i++) {
                answer += String.valueOf(str1.charAt(i));
                answer += String.valueOf(str2.charAt(i));
            }
            return answer;
        }
    }
}
