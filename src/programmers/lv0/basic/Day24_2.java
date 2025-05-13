package programmers.lv0.basic;
import java.util.*;

public class Day24_2 {
    /* map을 활용한 풀이
        class Solution {
        public int solution(String[] strArr) {
            Map<Integer, Integer> map = new HashMap<>();
            int answer = 0;
            for (int i=0; i<strArr.length; i++) {
                int key = strArr[i].length();
                int value = map.getOrDefault(key,0) +1;
                map.put(key, value);
                answer = Math.max(answer, value);
            }
            return answer;
        }
    }
     */
    class Solution {
        public int solution(String[] strArr) {
            int[][] count = new int[31][2];
            for(int i=0; i<strArr.length; i++) {
                count[strArr[i].length()][1]++;
            }
            int answer = 0;
            for (int i=0; i<count.length; i++) {
                if (answer <count[i][1]) answer =count[i][1];
            }
            return answer;
        }
    }
}
