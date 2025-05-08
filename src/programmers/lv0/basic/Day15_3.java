package programmers.lv0.basic;
import java.util.*;

public class Day15_3 {
    class Solution {
        public int[] solution(int[] arr, int[][] intervals) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<intervals.length; i++) {
                for(int j=intervals[i][0]; j<=intervals[i][1]; j++) {
                    list.add(arr[j]);
                }
            }
            int[] answer = new int[list.size()];
            for(int i=0; i<answer.length; i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
