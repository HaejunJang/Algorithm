package programmers.lv0;
import java.util.*;

public class Day20_2 {
    class Solution {
        public int solution(int[] sides) {
            //sides를 sort해서 가장 마지막 인덱스(가장 큰값)을 구하고
            //1. 가장 큰값이 나머지 2개의 길이 합보다 작은 경우
            //2. 가장 큰값이 가장 긴 변이 되는 경우 - 두 변의 길이합이 큰값보다 크고 범위는 큰값보다 작게
            int answer = 0;
            Arrays.sort(sides);
            //가장긴변을 구할때
            for(int i =sides[1] + 1; i < sides[0] + sides[1]; i++) {
                answer++;
            }

            //sides[0]가 가장 긴변일때
            for(int i = sides[1]-sides[0]+1; i<= sides[1]; i++) {
                answer++;
            }

            return answer;
        }
    }
}
