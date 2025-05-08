package programmers.lv0.basic;

public class Day14_4 {
    class Solution {
        public int solution(int[] numbers, int n) {
            int answer = 0;
            int count =0;
            while(true) {
                if(answer >n) break;
                answer +=numbers[count++];
            }
            return answer;
        }
    }
}
