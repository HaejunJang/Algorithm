package programmers.lv0.basic;

public class Day10_4 {
    class Solution {
        public int solution(String number) {
            int answer = 0;
            for(int i=0; i<number.length(); i++) {
                answer += Integer.parseInt(String.valueOf(number.charAt(i)));
            }
            return answer %9;
        }
    }

    /*
    class Solution {
    public int solution(String number) {
        char[] cArr = number.toCharArray();
        int answer = 0;

        for( char c : cArr) {
            answer += c - '0';
        }
        return answer % 9;
    }
}
     */
}
