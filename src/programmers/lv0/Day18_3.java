package programmers.lv0;

public class Day18_3 {
    class Solution {
        public int solution(int[] array) {
            int answer = 0;
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<array.length; i++) {
                sb.append(String.valueOf(array[i]));
            }
            String[] nums = sb.toString().split("");
            for (String num : nums) {
                if(num.equals(String.valueOf(7))) {
                    answer++;
                }
            }
            return answer;
        }
    }
}
