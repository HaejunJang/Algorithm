package programmers.lv0.introduction;

public class Day16_2 {
    class Solution {
        public int solution(int n) {
            if (n % Math.sqrt(n) == 0) {
                return 1;
            } else {
                return 2;
            }
        }
    }
}
