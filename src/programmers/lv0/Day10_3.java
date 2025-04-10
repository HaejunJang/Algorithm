package programmers.lv0;

import java.util.ArrayList;

public class Day10_3 {

    class Solution {
        public int solution(int[] numbers, int k) {
            //던지는 사람의 번호를 담는 배열을 만들고
            //해당 배열의 값을 반환
            //이때 k번째는 인덱스 기준 k-1위치이다
            int answer = 0;
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            //던지는 사람 배열
            for (int i=0; i<k; i++) {
                if (list.get(i) + 2 >numbers.length) {
                    list.add(list.get(i) + 2 - numbers.length);
                } else {
                    list.add(list.get(i)+2);
                }
            }
            answer = list.get(k-1);

            return answer;
        }
    }
}
