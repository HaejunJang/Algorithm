package programmers.lv0;

public class Day8_3 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            String str = String.valueOf(n);

            for(int i=0; i<str.length(); i++) {
                answer += Integer.parseInt(str.substring(i,i+1));
            };
            return answer;
        }
    }
}
