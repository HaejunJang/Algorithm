package programmers.lv0;

public class Day13_1{
    class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;
            int gap = 100;
            for (int i=0; i<array.length; i++) {
                int diff = Math.abs(n - array[i]);
                if (gap > diff) {
                    gap = diff;
                    answer = array[i];
                }else if (gap == diff) {
                    if (answer > array[i]) {
                        answer = array[i];
                    }
                }
            }
            return answer;
        }
    }
}
