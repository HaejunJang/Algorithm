package programmers.lv0.introduction;

import java.util.Arrays;

public class Day7_3 {
    /*
    class Solution {
        public int solution(int[] sides) {
            int answer = 0;
            int max = 0;
            int sum = 0;
            //배열에서 가장 긴 길이값의 인덱스를 저장하게 해야함
            //가장 큰 값을 찾는다고 치면
            for (int i=0; i<sides.length; i++) {
                if(sides[max] <= sides[i]) {
                    max = i;
                }
            }
            //max 길이가 나머지 합보다 작은지 체크 후 리턴
            for (int i=0; i<sides.length; i++) {
                if(i != max) {
                    sum += sides[i];
                }
            }
            if (sum > sides[max]) {
                answer = 1;
            } else {
                answer = 2;
            }
            return answer;
        }
    }
    */

    class Solution {
        public int solution(int[] sides) {
            int answer = 0;
            Arrays.sort(sides);

            if (sides[2] < sides[0] + sides[1]) {
                answer = 1;
            } else {
                answer = 2;
            }
            return answer;
        }
    }
}
