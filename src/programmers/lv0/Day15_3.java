package programmers.lv0;

public class Day15_3 {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            //배열에 split으로 구분해서 넣고
            //첫번째 값은 미리 값에 넣고
            String[] fomular = my_string.split(" ");
            answer = Integer.parseInt(fomular[0]);
            for(int i=1; i<fomular.length; i+=2) {
                if(fomular[i].equals("+")){
                    answer += Integer.parseInt(fomular[i+1]);
                } else {
                    answer -= Integer.parseInt(fomular[i+1]);
                }
            }

            return answer;
        }
    }
}
