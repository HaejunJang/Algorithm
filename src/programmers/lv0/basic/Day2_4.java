package programmers.lv0.basic;

public class Day2_4 {
    class Solution {
        public String solution(String my_string, String overwrite_string, int s) {
            String answer = my_string;
            answer = answer.substring(0,s);
            answer = answer+overwrite_string;
            if(answer.length() < my_string.length()) {
                answer+=my_string.substring(answer.length());
            }
            return answer;
        }
    }
}
