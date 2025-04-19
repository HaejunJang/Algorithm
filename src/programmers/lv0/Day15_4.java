package programmers.lv0;

public class Day15_4 {
    class Solution {
        public int solution(int num, int k) {
            int answer = -1;
            String temp = String.valueOf(num);
            if (temp.contains(String.valueOf(k))) {
                answer = temp.indexOf(String.valueOf(k)) +1;
            }
            return answer;
        }
    }
}
