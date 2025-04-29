package programmers.lv0.basic;
import java.util.*;

public class Day6_1 {
    class Solution {
        public int[] solution(String myString) {
            int count=0;
            char x = 'x';
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<myString.length(); i++) {
                if(x == myString.charAt(i)) {
                    list.add(count);
                    count =0;
                } else {
                    count++;
                }
            }
            list.add(count);
            int[] answer = new int[list.size()];
            for (int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
