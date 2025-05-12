package programmers.lv0.basic;
import java.util.Arrays;

public class Day23_2 {
    class Solution {
        public int[] solution(int[] arr) {
            int len = 1;
            while (len <arr.length) {
                len *=2;
            }
            return Arrays.copyOf(arr,len);
        }
    }
}
