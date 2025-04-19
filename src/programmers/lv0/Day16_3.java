package programmers.lv0;

public class Day16_3 {
    class Solution {
        public int solution(int[] array, int height) {
            int answer = 0;
            for(int i=0; i<array.length; i++) {
                if(array[i] > height) {
                    answer++;
                }
            }
            return answer;
        }
    }
}
