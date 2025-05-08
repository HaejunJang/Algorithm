package programmers.lv0.basic;

public class Day12_5 {
    class Solution {
        public String solution(int q, int r, String code) {
            //인덱스를 q로 나눠서 나머지가 r 인 문자
            //==인덱스가 r이고 q씩 증가한 위치의 문제
            String answer = "";
            for(int i=r; i<code.length(); i+=q) {
                answer += code.substring(i,i+1);
            }
            return answer;
        }
    }
}
