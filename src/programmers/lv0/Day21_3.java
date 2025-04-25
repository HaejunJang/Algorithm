package programmers.lv0;

public class Day21_3 {
    class Solution {
        public int solution(int a, int b) {
            int answer = 2;
            int x = getGCD(a,b);
            System.out.println(x);

            int k = b/x;
            System.out.println("나누고 난 후: " + k);

            k = div2(k);
            System.out.println("2로 나누고 난 후: " + k);

            k = div5(k);
            System.out.println("5로 나누고 난 후: " + k);

            if (k == 1) {
                answer =1;
            }
            return answer;
        }

        public int div2(int x) {
            if(x % 2 !=0) {
                return x;
            }
            x /=2;
            return div2(x);
        }

        public int div5(int x) {
            if(x % 5 !=0) {
                return x;
            }
            x /=5;
            return div5(x);
        }

        public int getGCD(int x, int y) {
            if (x % y == 0) {
                return y;
            }
            return getGCD(y, x%y);
        }
    }
}
