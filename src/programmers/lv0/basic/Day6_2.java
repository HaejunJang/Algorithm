package programmers.lv0.basic;
import java.util.*;

public class Day6_2 {
    class Solution {
        public String[] solution(String my_string) {
            ArrayList<String> list = new ArrayList<>();
            my_string = my_string.trim();
            String[] answer = my_string.split(" +");
            return answer;
        }
    }
}
