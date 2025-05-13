package programmers.lv0.basic;

public class Day25_4 {
    class Solution {
        public int[][] solution(int[][] arr) {
            if(arr.length == arr[0].length) {
                return arr;
            }
            if (arr.length > arr[0].length) {
                int x = arr.length;
                int[][] answer = new int[x][x];
                for(int i=0; i<answer.length; i++) {
                    for(int j=0; j<arr[i].length; j++) {
                        answer[i][j] = arr[i][j];
                    }
                }
                return answer;
            } else {
                int x = arr[0].length;
                int[][] answer = new int[x][x];
                for (int i=0; i<arr.length; i++) {
                    for (int j=0; j<arr[i].length; j++) {
                        answer[i][j] = arr[i][j];
                    }
                }
                return answer;
            }
        }
    }
}
