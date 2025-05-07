package programmers.lv0.basic;
import java.util.*;

public class Day10_3 {
    class Solution {
        public String solution(String my_string, int[] index_list) {
            ArrayList<Character> list = new ArrayList<>();
            for(int i=0; i<index_list.length; i++) {
                list.add(my_string.charAt(index_list[i]));
            }
            String answer = "";
            for(int i=0; i<list.size(); i++) {
                answer+= list.get(i);
            }
            return answer;
        }
    }
}
