package programmers.lv0.basic;
import java.util.*;

public class Day19_2 {
    class Solution {
        public int[] solution(int[] arr, int[] delete_list) {
            Set<Integer> set = new HashSet<>();
            ArrayList<Integer> list = new ArrayList<>();

            for (int i=0; i<delete_list.length; i++) {
                set.add(delete_list[i]);
            }
            for (int i=0; i<arr.length; i++) {
                if(!set.contains(arr[i])) {
                    list.add(arr[i]);
                }
            }
            int[] answer = new int[list.size()];
            for(int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
