package programmers.lv0;

public class Day18_4 {
    class Solution {
        public String[] solution(String my_str, int n) {
            int size= 0;
            if(my_str.length() %n == 0) {
                size = my_str.length() /n;
            } else {
                size= my_str.length() /n +1;
            }
            String[] answer = new String[size];

            int start = 0;
            int end = n;
            for(int i=0; i<answer.length; i++){
                if (end > my_str.length()) {
                    answer[i] = my_str.substring(start);
                } else {
                    answer[i]= my_str.substring(start,end);
                }
                start = end;
                end +=n;
            }

            return answer;
        }
    }
}
