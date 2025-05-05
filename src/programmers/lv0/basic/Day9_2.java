package programmers.lv0.basic;

public class Day9_2 {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            //그냥 for문 2번
            // 처음은 쿼리 수만큼 반복
            //두번째는 범위만큼
            for(int i=0; i<queries.length; i++) {
                for(int j=queries[i][0]; j<=queries[i][1]; j++) {
                    if(j % queries[i][2] == 0) {
                        arr[j]++;
                    }
                }
            }
            return arr;
        }
    }
}
