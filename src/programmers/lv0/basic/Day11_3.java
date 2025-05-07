package programmers.lv0.basic;

public class Day11_3 {
    class Solution {
        public String solution(String my_string, int n) {
            String answer = my_string.substring(my_string.length()-n);
            return answer;
        }
    }
}
