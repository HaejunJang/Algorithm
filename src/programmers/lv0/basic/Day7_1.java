package programmers.lv0.basic;

public class Day7_1 {
    class Solution {
        public String solution(String code) {
            StringBuilder sb = new StringBuilder();
            int mode = 0;
            for(int i=0; i<code.length(); i++) {
                if(code.charAt(i) == '1') {
                    if (mode == 0) {
                        mode = 1;
                    } else {
                        mode = 0;
                    }
                } else {
                    if (mode == 0 && i %2 == 0) {
                        sb.append(code.charAt(i));
                    } else if( mode == 1 && i % 2 == 1) {
                        sb.append(code.charAt(i));
                    }
                }
            }
            String answer = sb.toString();
            if (answer.isEmpty()) {
                answer = "EMPTY";
            }
            return answer;
        }
    }
}
