package programmers.lv0.basic;

public class Day24_4 {
    class Solution {
        public int solution(String[] order) {
            //아메 4500 카페라떼 5000
            //anything도 아메리카노
            int answer = 0;
            for (int i=0; i<order.length; i++) {
                if(order[i].contains("cafelatte")) {
                    answer+=5000;
                } else {
                    answer+=4500;
                }
            }
            return answer;
        }
    }
}
