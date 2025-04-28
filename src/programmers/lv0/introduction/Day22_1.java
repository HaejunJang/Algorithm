package programmers.lv0.introduction;

import java.util.Arrays;

public class Day22_1 {
    class Solution {
        public int[] solution(int[][] score) {
            //2차원배열에 평균점수와 원래 인덱스를 저장
            int[] answer = new int[score.length];
            int[][] scores = new int[score.length][2];
            int count = 1; //등수
            int countTemp = 0; //공동등수일때 스택
            for(int i=0; i<score.length; i++) {
                scores[i][0] = (score[i][0] + score[i][1]);
                scores[i][1] = i;
            }

            Arrays.sort(scores, (a,b) -> {
                return b[0] - a[0];
            });

            answer[scores[0][1]] = count; //1등 먼저 넣기

            for(int i=1; i<scores.length; i++) {
                if(scores[i][0] == scores[i-1][0] ) {
                    answer[scores[i][1]] = count;
                }
                else {
                    count = i +1;
                    answer[scores[i][1]] = count;
                }
            }

            return answer;
        }
    }
}
