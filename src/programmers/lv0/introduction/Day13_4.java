package programmers.lv0.introduction;

public class Day13_4 {
    //대소문자 변환
    class Solution {
        public String solution(String my_string) {
            String answer = "";
            for(int i=0; i<my_string.length(); i++) {
                char ch = my_string.charAt(i);
                if ((int)ch >=97) {
                    answer += String.valueOf(ch).toUpperCase();
                } else {
                    answer += String.valueOf(ch).toLowerCase();
                }
            }
            return answer;
        }
    }
    //올바른 정답
    /*
    class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(Character.isUpperCase(ch)) {
                answer += String.valueOf(ch).toLowerCase();
            } else {
                answer += String.valueOf(ch).toUpperCase();
            }
        }
        return answer;
    }
}
     */
}
