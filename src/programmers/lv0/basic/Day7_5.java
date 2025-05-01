package programmers.lv0.basic;

public class Day7_5 {
    class Solution {
        public int solution(int[] num_list) {
            String sum1 = "";
            String sum2 = "";
            for(int i=0; i<num_list.length; i++) {
                if(num_list[i] % 2 == 0) {
                    sum2 += String.valueOf(num_list[i]);
                } else {
                    sum1 += String.valueOf(num_list[i]);
                }
            }
            return Integer.parseInt(sum1) + Integer.parseInt(sum2);
        }
    }
}
