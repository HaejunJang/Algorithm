package programmers.lv0.basic;

public class Day25_1 {
    class Solution {
        public String solution(String a, String b) {
            StringBuilder sb = new StringBuilder();

            int i = a.length() - 1;
            int j = b.length() - 1;
            int carry = 0;

            while (i >=0 || j >=0 || carry >0) {
                int digitA = (i >=0) ? a.charAt(i) - '0' : 0;
                int digitB = (j >=0) ? b.charAt(j) - '0' : 0;
                int sum = digitA + digitB + carry;
                sb.append(sum % 10);
                carry = sum /10;
                j--;
                i--;
            }
            return sb.reverse().toString();
        }
    }
}
