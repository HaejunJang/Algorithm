package programmers.lv0.introduction;

public class Day9_2 {
    class Solution {
        public int solution(int hp) {
            return hp/5 + (hp%5 /3) + (hp %5 %3);
        }
    }
}
