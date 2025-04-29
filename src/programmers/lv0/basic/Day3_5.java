package programmers.lv0.basic;

public class Day3_5 {
    class Solution {
        public int solution(int a, int b) {
            int answer = Math.max(Integer.parseInt(a + "" + b), a*b*2);
            return answer;
        }
    }
}
