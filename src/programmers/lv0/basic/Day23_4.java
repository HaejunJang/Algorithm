package programmers.lv0.basic;

public class Day23_4 {
    class Solution {
        public String solution(String myString, String pat) {
            return myString.substring(0,myString.lastIndexOf(pat)+pat.length());
        }
    }
}
