package programmers.lv0;

public class Day7_2 {
    class Solution {
        public int[] solution(String[] strlist) {
            int[] answer = new int[strlist.length];

            for (int i=0; i< strlist.length; i++) {
                answer[i] = strlist[i].length();
            }
            return answer;
        }
    }
}
