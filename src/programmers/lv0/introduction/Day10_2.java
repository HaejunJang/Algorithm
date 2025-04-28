package programmers.lv0.introduction;

public class Day10_2 {
    class Solution {
        public int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length/n][n]; //[4][2]. num_list.length = 8
            int count =0;
            for (int i=0; i<num_list.length/n; i++) {
                for (int j=0; j<n; j++) {
                    answer[i][j] = num_list[count];
                    count++;
                }
            }
            return answer;
        }
    }
}
