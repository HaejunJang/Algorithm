package programmers.lv0.basic;
import java.util.*;

public class Day6_4 {
    class Solution {
        public String[] solution(String[] strArr) {
            ArrayList<String> list = new ArrayList<>();
            for(int i=0; i<strArr.length; i++) {
                if(!strArr[i].contains("ad")) {
                    list.add(strArr[i]);
                }
            }
            String[] answer = new String[list.size()];
            for(int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
