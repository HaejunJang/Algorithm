package programmers.lv0.introduction;

public class Day23_1 {
    class Solution {
        public String solution(String bin1, String bin2) {
            //2진수 표현 어떻게 할까?
            //2진수 -> 10진수 : Integer.parseInt(binary, 2) 결과 타입 : int
            //10진수 -> 2진수 : Integer.toBinaryString(int) 결과 타입 : String
            String answer = "";
            int x = 0;
            int y = 0;
            int sum = 0;
            x = Integer.parseInt(bin1, 2);
            y = Integer.parseInt(bin2, 2);
            sum = x + y;
            answer = Integer.toBinaryString(sum);

            return answer;
        }
    }
}
