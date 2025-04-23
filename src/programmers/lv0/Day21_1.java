package programmers.lv0;

public class Day21_1 {
    class Solution {
        public int solution(int[][] dots) {
            int answer = 0;
            double gradient1 = 0;
            double gradient2 = 0;
            for (int i=1; i<dots.length; i++) {
                gradient1 = (double)(dots[0][1] - dots[i][1]) / (dots[0][0] - dots[i][0]);

                if(i == 1) {
                    gradient2 = (double)(dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]);
                    System.out.println("1번일떄 : " + gradient1 + "  " + gradient2);
                }

                if (i == 2) {
                    gradient2 = (double)(dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);
                    System.out.println("2번일떄 : " + gradient1 + "  " + gradient2);
                }

                if (i == 3) {
                    gradient2 = (double)(dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]);
                    System.out.println("3번일떄 : " + gradient1 + "  " + gradient2);
                }

                if (gradient1 == gradient2) {
                    answer = 1;
                }
            }
            return answer;
        }
    }
}
