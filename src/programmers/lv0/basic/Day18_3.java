package programmers.lv0.basic;

import java.util.Arrays;

public class Day18_3 {
    class Solution {
        public int[] solution(int[] arr, int[] query) {
            for (int i=0; i<query.length; i++) {
                if (i%2 == 0) {
                    arr = Arrays.copyOfRange(arr,0,query[i]+1);
                    // System.out.println(Arrays.toString(arr));
                } else {
                    arr = Arrays.copyOfRange(arr,query[i], arr.length);
                    // System.out.println(Arrays.toString(arr));
                }
            }
            return arr;
        }
    }
}
