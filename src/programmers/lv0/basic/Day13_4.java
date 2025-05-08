package programmers.lv0.basic;

public class Day13_4 {
    class Solution {
        public int solution(String myString, String pat) {
            if (myString.toLowerCase().contains(pat.toLowerCase())) return 1;
            return 0;
        }
    }
}
