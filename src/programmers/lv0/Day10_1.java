package programmers.lv0;

public class Day10_1 {
    class Solution {
        public int solution(int balls, int share) {
            long answer = 1;
            if (balls > balls-share) share = balls-share;
            for (int i=1; i<=share; i++) {
                answer *= (balls -i +1);
                answer /= i;
            }
            return (int)answer;
        }
    }
}
