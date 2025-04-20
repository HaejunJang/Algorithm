package programmers.lv0;

public class Day18_2 {
    class Solution {
        public int solution(int i, int j, int k) {
            int answer = 0;
            StringBuilder sb = new StringBuilder();
            for(int a=i; a<=j; a++) {
                sb.append(String.valueOf(a));
            }
            String[] arrNums = sb.toString().split("");
            for (String nums : arrNums) {
                if(nums.equals(String.valueOf(k))) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
