package programmers.lv0.basic;

public class Day12_2 {
    class Solution {
        public int solution(String my_string, String is_prefix) {
            for(int i=0; i<my_string.length(); i++) {
                if(my_string.substring(0,i).equals(is_prefix) ) {
                    return 1;
                }
                System.out.println(my_string.substring(0,i));
            }
            return 0;
        }
    }
}
