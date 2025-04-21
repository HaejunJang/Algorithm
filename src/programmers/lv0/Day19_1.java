package programmers.lv0;
import java.util.*;

public class Day19_1 {
    class Solution {
        public int solution(int[][] dots) {
            int answer = 0;
            //x좌표끼리 값을 가져와서 큰거에서 작은거 빼
            //y 좌표도 마찬가지로 구해서 answer에는 곱해서 반환
            int[] xArr = new int[4];
            int[] yArr = new int[4];

            for(int i=0; i<dots.length; i++) {
                xArr[i] = dots[i][0];
                yArr[i] = dots[i][1];
            }
            Arrays.sort(xArr);
            Arrays.sort(yArr);
            int xLength = xArr[3] - xArr[0];
            int yLength = yArr[3] - yArr[0];
            answer = xLength * yLength;
            return answer;
        }
    }
}
