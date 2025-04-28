package programmers.lv0.introduction;

public class Day11_3 {
    class Solution {
        public int solution(int n) {
            int answer = 1;
            int temp = 1; //계산값
            for(int i=1; temp<n; i++) {
                temp *= i;
                if (temp > n ) {
                    answer = i-1;
                    return answer;
                } else if (temp == n) {
                    answer = i;
                    return answer;
                }
            }
            return answer;
        }
    }
}
