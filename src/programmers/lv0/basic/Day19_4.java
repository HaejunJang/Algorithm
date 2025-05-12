package programmers.lv0.basic;

public class Day19_4 {
    class Solution {
        public String solution(String n_str) {
            StringBuilder sb = new StringBuilder(n_str);
            while(n_str.startsWith("0")) {
                n_str = n_str.substring(1,n_str.length());
            }
            return n_str;
        }
    }
}
