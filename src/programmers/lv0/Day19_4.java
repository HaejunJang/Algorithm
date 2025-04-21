package programmers.lv0;

public class Day19_4 {
    //정규표현식 사용
    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            String[] str =my_string.replaceAll("[a-zA-Z]", " ").split(" ");
            for(String s : str) {
                if(!s.equals("")) answer += Integer.parseInt(s);
            }

            return answer;
        }
    }

    /* 초기 시도
    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            String tempNum = "";
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<my_string.length(); i++) {
                if(Character.isDigit(my_string.charAt(i)) && i != my_string.length()) {
                    sb.append(my_string.charAt(i));
                } else if (Character.isDigit(my_string.charAt(i)) && i == my_string.length()) {
                    sb.append(my_string.charAt(i));
                } else if (sb.length() > 0){
                    answer += Integer.parseInt(sb.toString());
                    sb.delete(0, sb.length());
                }
            }

            if (sb.length() >0) {
                answer +=Integer.parseInt(sb.toString());
            }
            return answer;
        }

    }
    */
}
