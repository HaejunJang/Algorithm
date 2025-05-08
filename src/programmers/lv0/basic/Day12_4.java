package programmers.lv0.basic;

public class Day12_4 {
    class Solution {
        public String solution(String my_string, int m, int c) {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<my_string.length(); i+=m) {
                sb.append(my_string.substring(i,i+m).substring(c-1,c));
            }
            return sb.toString();
        }
    }
}
