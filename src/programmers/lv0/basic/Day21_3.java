package programmers.lv0.basic;
import java.util.*;

public class Day21_3 {
    class Solution {
        public int[] solution(int[] num_list) {
            Arrays.sort(num_list);
            int[] answer = new int[5];
            answer = Arrays.copyOfRange(num_list,0, 5);
            return answer;
        }
    }
}
