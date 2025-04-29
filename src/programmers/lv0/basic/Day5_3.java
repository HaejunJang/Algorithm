package programmers.lv0.basic;

public class Day5_3 {
    class Solution {
        public int solution(int[] arr1, int[] arr2) {
            //배열의 길이가 같은지 먼저 체크
            if (arr1.length == arr2.length) {
                int x = 0;
                int y = 0;
                for (int i=0; i <arr1.length; i++) {
                    x += arr1[i];
                    y += arr2[i];
                }
                if (x > y) {
                    return 1;
                } else if (x == y) {
                    return 0;
                } else {
                    return -1;
                }
            } else {
                if (arr1.length > arr2.length) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
    }
}
