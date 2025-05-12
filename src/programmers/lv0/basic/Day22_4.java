package programmers.lv0.basic;
import java.util.ArrayList;

public class Day22_4 {
    class Solution {
        public int[] solution(int[] arr, boolean[] flag) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i=0; i<arr.length; i++) {
                if(flag[i] == true) {
                    for(int j=0; j<arr[i] *2; j++) {
                        list.add(arr[i]);
                    }
                } else {
                    for (int j=0; j<arr[i]; j++) {
                        list.remove(list.size()-1);
                    }
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
