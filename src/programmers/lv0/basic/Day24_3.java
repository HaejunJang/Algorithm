package programmers.lv0.basic;
import java.util.ArrayList;

public class Day24_3 {
    class Solution {
        public String[] solution(String myStr) {
            ArrayList<String> list = new ArrayList<>();
            myStr = myStr.replace("a","1");
            myStr = myStr.replace("b","1");
            myStr = myStr.replace("c","1");
            String[] temp = myStr.split("1");
            for(int i=0; i<temp.length; i++) {
                if(!temp[i].isEmpty()) {
                    list.add(temp[i]);
                }
            }
            if (list.size() ==0 ) {
                return new String[] {"EMPTY"};
            }
            String[] answer = new String[list.size()];
            for (int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
