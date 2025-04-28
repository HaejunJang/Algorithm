package programmers.lv0.introduction;

public class Day22_2 {
    class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            for( int i=0; i<babbling.length; i++) {

                while(babbling.length>0) {
                    if (babbling[i].startsWith("aya")) {
                        babbling[i]= babbling[i].substring(3);
                        System.out.println("aya 문 실행");
                    }else if ( babbling[i].startsWith("ye")) {
                        babbling[i] = babbling[i].substring(2);
                    } else if (babbling[i].startsWith("woo")) {
                        babbling[i] = babbling[i].substring(3);
                    } else if (babbling[i].startsWith("ma")) {
                        babbling[i] = babbling[i].substring(2);
                    } else {
                        System.out.println(i +"번째 끝나고 길이 체크 : " + babbling[i].length());
                        break;
                    }
                }
                if(babbling[i].length() == 0) {
                    answer++;
                }
            }
            return answer;
        }
    }
}
