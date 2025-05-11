package programmers.lv0.basic;

public class Day17_5 {
    class Solution {
        public String solution(String my_string, int[] indices) {
            StringBuilder sb = new StringBuilder(my_string);
            for(int i=0; i<indices.length; i++) {
                sb.replace(indices[i], indices[i]+1, "1");
            }
            return sb.toString().replace("1", "");
        }
    }
}
