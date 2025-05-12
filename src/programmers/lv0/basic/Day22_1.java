package programmers.lv0.basic;
import java.util.*;

public class Day22_1 {
    class Solution {
        public String[] solution(String myString) {
            ArrayList<String> list = new ArrayList<>();
            String[] answer = myString.split("x");
            Arrays.sort(answer);
            for(int i=0; i<answer.length; i++) {
                if(!answer[i].isEmpty()) {
                    list.add(answer[i]);
                }
            }
            String[] arr = new String[list.size()];
            for(int i=0; i<arr.length; i++) {
                arr[i] = list.get(i);
            }
            return arr;
        }
    }
}
