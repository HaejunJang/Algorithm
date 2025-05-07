package programmers.lv0.basic;

public class Day12_3 {
    //코드 개선하기
    class Solution {
        public String solution(String my_string, int s, int e) {
            StringBuilder sb = new StringBuilder(my_string);
            sb.replace(s,e+1, new StringBuilder(sb.substring(s,e+1)).reverse().toString());
            return sb.toString();
        }
    }
    /*
    class Solution {
        public String solution(String my_string, int s, int e) {
            StringBuilder sb = new StringBuilder(my_string);
            String temp = sb.substring(s,e+1);
            StringBuilder sb2 = new StringBuilder(temp);
            sb2.reverse();
            sb.replace(s,e+1,sb2.toString());
            return sb.toString();
        }
    }
    */
}
