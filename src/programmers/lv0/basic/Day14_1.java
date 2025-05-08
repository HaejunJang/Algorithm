package programmers.lv0.basic;

import java.util.Arrays;

public class Day14_1 {

    class Solution {
        public int[] solution(int[] num_list, int n) {
            return Arrays.copyOfRange(num_list, 0, n);
        }
//            int[] answer = new int[n];
//            for(int i=0; i<n; i++) {
//                answer[i] = num_list[i];
//            }
//            return answer;
//        }
    }
}
