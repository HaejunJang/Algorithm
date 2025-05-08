package programmers.lv0.basic;

public class Day16_4 {
    class Solution {
        public String solution(String myString) {
            char[] arr = myString.toCharArray();
            String answer ="";

            for(int i=0; i<arr.length; i++) {
                if(arr[i] == 'a') {
                    answer += String.valueOf(arr[i]).toUpperCase();
                } else if ( Character.isUpperCase(arr[i]) && arr[i] != 'A') {
                    answer += String.valueOf(arr[i]).toLowerCase();
                } else {
                    answer += arr[i];
                }
            }

            return answer;
        }
    }
}
