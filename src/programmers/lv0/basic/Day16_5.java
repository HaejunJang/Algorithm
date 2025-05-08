package programmers.lv0.basic;

public class Day16_5 {
    class Solution {
        public int solution(String binomial) {
            String[] cal = binomial.split(" ");
            int result = 0;
            if(cal[1].equals("+")) {
                result = Integer.parseInt(cal[0]) + Integer.parseInt(cal[2]);
            } else if (cal[1].equals("-")) {
                result = Integer.parseInt(cal[0]) - Integer.parseInt(cal[2]);
            } else if (cal[1].equals("*")) {
                result = Integer.parseInt(cal[0]) * Integer.parseInt(cal[2]);
            }
            return result;
        }
    }
}
