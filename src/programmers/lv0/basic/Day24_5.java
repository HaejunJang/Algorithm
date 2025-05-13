package programmers.lv0.basic;
import java.util.ArrayList;

public class Day24_5 {
    class Solution {
        public int[] solution(int[] arr) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<arr.length; i++) {
                if(list.isEmpty() == true) {
                    list.add(arr[i]);
                } else if(list.get(list.size()-1) == arr[i]) {
                    list.remove(list.size()-1);
                } else if(list.get(list.size()-1) != arr[i]) {
                    list.add(arr[i]);
                }
            }
            if (list.size() == 0) {
                return new int[] {-1};
            }
            int[] answer = new int[list.size()];
            for (int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
