package programmers.lv0.basic;
import java.util.*;

public class Day16_2 {
    class Solution {
        public int[] solution(int n, int k) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=k; i<=n; i+=k) {
                list.add(i);
            }
            int[] answer = new int[list.size()];
            for(int i=0; i< answer.length; i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
