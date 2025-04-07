package programmers.lv0;

import java.util.Arrays;

public class Day9_1 {
    class Solution {
        public int[] solution(int[] emergency) {
            int order = emergency.length;
            //sort를 해서 작은 수부터 나열한 배열을 만들고
            int[] sortArr = new int[order];
            int[] answerArr = new int[order];

            System.arraycopy(emergency, 0, sortArr, 0, emergency.length);
            Arrays.sort(sortArr);

            //값이 같다면 해당 값부터 emergency.size()-1씩 한 값을 넣는다
            for ( int i=0; i<emergency.length; i++) {
                for ( int j=0; j<emergency.length; j++) {
                    if (emergency[j] == sortArr[i]) {
                        answerArr[j] = order;
                        order--;
                    }
                }
            }

            // int[] answer = {};
            return answerArr;
        }
    }
}
