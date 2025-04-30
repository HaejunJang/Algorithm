package programmers.lv0.basic;

public class Day7_3 {
    class Solution {
        public int solution(int a, int b, int c) {
            int answer = 0;
            int count = 0;
            if (a ==b) count++;
            if (a ==c && a != b) count++;
            if (b ==c) count++;

            if (count ==2) {
                answer = (a+b+c) * ( (a*a) + (b*b) + (c*c)) * ( (a*a*a) + (b*b*b) + (c*c*c));
            } else if (count == 1) {
                answer = (a+b+c) * ( (a*a) + (b*b) + (c*c));
            } else {
                answer = a+b+c;
            }
            return answer;
        }
    }
}
