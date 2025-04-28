package programmers.lv0;

public class Day23_3 {
    class Solution {
        public int solution(int M, int N) {
            int answer = 0;
            if (M ==1 && N == 1) {
                return 0;
            }

            return M * N -1;
        }
    }
}
