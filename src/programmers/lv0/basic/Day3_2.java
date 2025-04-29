package programmers.lv0.basic;

public class Day3_2 {
    class Solution {
        public String solution(String[] arr) {
            StringBuilder sb = new StringBuilder();
            String answer = "";
            for(int i=0; i<arr.length; i++) {
                sb.append(arr[i]);
            }
            return sb.toString();
        }
    }
}
