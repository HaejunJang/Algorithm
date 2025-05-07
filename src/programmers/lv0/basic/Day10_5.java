package programmers.lv0.basic;

public class Day10_5 {
    class Solution {
        public String solution(String my_string, int[][] queries) {
            StringBuilder sb = new StringBuilder(my_string);
            for (int i=0; i<queries.length; i++) {
                String temp = new StringBuilder(sb.substring(queries[i][0], queries[i][1]+1)).reverse().toString();
                // System.out.println("추출한 값: "+ temp);
                my_string = sb.replace(queries[i][0], queries[i][1]+1, temp).toString();
                // System.out.println(i+"번째 이후: " + my_string);
            }
            return my_string;
        }
    }
}
