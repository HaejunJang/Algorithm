package programmers.lv0.basic;

public class Day8_4 {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = arr;
            int temp =0;

            for(int i=0; i<queries.length; i++) {
                temp = arr[queries[i][0]];
                answer[queries[i][0]] = answer[queries[i][1]];
                answer[queries[i][1]] = temp;

            }
            return answer;
        }
    }
}
