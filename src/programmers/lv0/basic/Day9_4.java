package programmers.lv0.basic;
import java.util.*;

public class Day9_4 {
    class Solution {
        public int[] solution(int n) {
            // list에 계산과정을 담고
            //while문으로 1이 될때까지 계산
            List<Integer> list = new ArrayList<>();
            list.add(n);
            while(n !=1) {
                if(n % 2 == 0) {
                    n /=2;
                    list.add(n);
                } else {
                    n = 3 * n + 1;
                    list.add(n);
                }
            }

            int[] answer = new int[list.size()];
            for (int i=0; i<answer.length; i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
