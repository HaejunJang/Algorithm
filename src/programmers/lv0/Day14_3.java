package programmers.lv0;

public class Day14_3 {
    class Solution {
        public String solution(String my_string, int num1, int num2) {
            String answer ="";
            StringBuilder sb =new StringBuilder();
            sb.append(my_string);
            String temp = sb.substring(num1, num1+1);
            sb.replace(num1,num1+1, sb.substring(num2,num2+1));
            sb.replace(num2, num2 +1, temp);
            answer = sb.toString();

            return answer;
        }
    }
}
