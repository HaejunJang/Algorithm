package programmers.lv0.basic;

public class Day25_3 {
    class Solution {
        public String[] solution(String[] picture, int k) {
            String[] answer = new String[picture.length * k];
            int idx = 0;
            for(int i=0; i<picture.length; i++) {
                StringBuilder sb = new StringBuilder();
                for(int j=0; j<picture[i].length(); j++) {
                    for(int x=0; x<k; x++) {
                        sb.append(picture[i].charAt(j));
                    }
                }
                String temp = sb.toString();
                for(int y =0; y<k; y++) {
                    answer[idx++] =temp;
                }
            }
            return answer;
        }
    }
}
