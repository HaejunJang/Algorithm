package programmers.lv0.basic;

public class Day18_2 {
    class Solution {
        public int[] solution(int[] arr) {
            int idx1 = -1;
            int idx2 = -1;
            int[] answer = {};

            for (int i=0; i<arr.length; i++) {
                if (arr[i] == 2) {
                    if(idx1 != -1) {
                        idx2 = i;
                    } else {
                        idx1 =i;
                    }
                }
            }
            // System.out.println(idx1);
            // System.out.println(idx2);
            if (idx1 == -1) {
                return new int[] {-1};
            } else if (idx2 == -1 && idx1 != -1) {
                return new int[] {2};
            } else {
                answer = new int[idx2-idx1 +1];
                for(int i=0; i<answer.length; i++) {
                    answer[i] = arr[idx1++];
                }
            }
            return answer;
        }
    }
}
