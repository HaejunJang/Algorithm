package programmers.lv0;

import java.util.Arrays;
public class Day21_4 {

    class Solution {
        public int[] solution(int[] numlist, int n) {
            //2차원 복사 배열에서 원본값, 거리값 저장
            //Comparator를 활용하여 정렬
            int[] answer = new int[numlist.length];
            int[][] temp = new int[numlist.length][2];
            for(int i=0; i<numlist.length; i++) {
                temp[i][0] = numlist[i];
                temp[i][1] = Math.abs(numlist[i]-n);
            }
            Arrays.sort( temp, (a,b) -> {
                if(a[1] == b[1]){
                    return b[0] - a[0];
                }
                return a[1] - b[1];
            });

            for(int i=0; i<temp.length; i++) {
                answer[i] = temp[i][0];
            }

            return answer;
        }
    }
}
