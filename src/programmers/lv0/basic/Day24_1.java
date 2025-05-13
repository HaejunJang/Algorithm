package programmers.lv0.basic;
import java.util.*;

public class Day24_1 {
    class Solution {
        public String[] solution(String[] str_list) {
            ArrayList<String> list = new ArrayList<>();
            String[] answer ={};

            for(int i=0; i<str_list.length; i++) {
                if ( str_list[i].equals("l") ) {
                    for(int j=0; j<i; j++) {
                        list.add(str_list[j]);
                    }
                    answer = new String[list.size()];
                    for (int k=0; k<list.size(); k++) {
                        answer[k] = list.get(k);
                    }
                    return answer;
                } else if (str_list[i].equals("r")) {
                    for (int j=i+1; j<str_list.length; j++) {
                        list.add(str_list[j]);
                    }
                    answer = new String[list.size()];
                    for (int k=0; k<list.size(); k++) {
                        answer[k] = list.get(k);
                    }
                    return answer;
                }
            }
            return answer;
        }
    }
}
