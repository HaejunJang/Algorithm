package programmers.lv0;

public class Day21_2 {
    class Solution {
        public int solution(int[][] lines) {
            //반열림으로 처리한다 a<= o < b
            //각 점의 위치에 들어온 횟수를 카운트
            int answer = 0;
            int[] counts = new int[201];
            int a=0;
            int b=0;

            for(int i=0; i<3; i++) {
                a = lines[i][0];
                b = lines[i][1];
                for (int j=a; j<b; j++) {
                    counts[j+100]++;
                }
            }

            for(int i=0; i<counts.length; i++) {
                if(counts[i] >1){
                    answer++;
                }
            }

            return answer;
        }
    }
}
