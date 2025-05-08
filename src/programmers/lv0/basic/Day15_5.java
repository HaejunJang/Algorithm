package programmers.lv0.basic;

public class Day15_5 {
    class Solution {
        public int solution(int[] arr, int idx) {
            for(int i= idx; i<arr.length; i++) {
                if(arr[i] == 1) return i;
            }
            return -1;
        }
    }
}
