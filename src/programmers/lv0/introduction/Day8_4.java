package programmers.lv0.introduction;

public class Day8_4 {
    class Solution {
        public String solution(int age) {
            String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
            String answer = "";

            while(age>0) {
                answer = alpha[age%10] +answer;
                age /=10;
            }

            return answer;
        }
    }

    /* //잘못된 방식
    class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String answer = String.valueOf(age);
        sb.append(answer);

        for(int i=0; i<answer.length(); i++) {
            if (sb.charAt(i)=='0') {
                sb.setCharAt(i, 'a');
            } else if (sb.charAt(i) == '1') {
                sb.setCharAt(i, 'b');
            } else if (sb.charAt(i) == '2') {
                sb.setCharAt(i, 'c');
            } else if (sb.charAt(i) == '3') {
                sb.setCharAt(i, 'd');
            } else if (sb.charAt(i) == '4') {
                sb.setCharAt(i, 'e');
            } else if (sb.charAt(i) == '5') {
                sb.setCharAt(i, 'f');
            } else if (sb.charAt(i) == '6') {
                sb.setCharAt(i, 'g');
            } else if (sb.charAt(i) == '7') {
                sb.setCharAt(i, 'h');
            } else if (sb.charAt(i) == '8') {
                sb.setCharAt(i, 'i');
            } else  {
                sb.setCharAt(i, 'j');
            }
        }
        answer = sb.toString();
        return answer;
    }
}
     */
}
