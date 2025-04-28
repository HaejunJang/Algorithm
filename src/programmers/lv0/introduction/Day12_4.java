package programmers.lv0.introduction;
import java.util.List;
import java.util.ArrayList;

public class Day12_4 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";
            List<Character> list = new ArrayList<>();
            for (int i=0; i<my_string.length(); i++) {
                if (!list.contains(my_string.charAt(i))) {
                    list.add(my_string.charAt(i));
                }
            }
            for (int i=0; i<list.size(); i++) {
                answer += String.valueOf(list.get(i));
            }
            return answer;
        }
    }
}
