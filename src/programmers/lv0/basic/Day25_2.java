package programmers.lv0.basic;

import java.util.ArrayList;
import java.util.*;

public class Day25_2 {
    class Solution {
        public int[] solution(int[] arr, int k) {
            ArrayList<Integer> list = new ArrayList<>();
            int[] answer = new int[k];
            for(int i=0; i<answer.length; i++) {
                answer[i] = -1;
            }
            for(int i=0; i<arr.length; i++) {
                if(!list.contains(arr[i])) {
                    list.add(arr[i]);
                }
            }
            for(int i=0; i<list.size(); i++) {
                if(answer.length>i){
                    answer[i] = list.get(i);
                }
            }
            return answer;
        }
    }
}
