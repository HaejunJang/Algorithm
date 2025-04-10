package programmers.lv0;

public class Day10_4 {
    class Solution {
        public int[] solution(int[] numbers, String direction) {
            //기존 복사 배열 만들기
            int[] temp = new int[numbers.length];
            for (int i=0; i<numbers.length; i++) {
                temp[i] = numbers[i];
            }

            if (direction.equals("right")) {
                for (int i=0; i<numbers.length; i++) {
                    if (i + 1 == numbers.length) {
                        numbers[0] = temp[i];
                    } else {
                        numbers[i+1] = temp[i];
                    }
                }
            } else {
                for (int i=numbers.length-1; i>=0; i--) {
                    if (i ==0) {
                        numbers[numbers.length-1] = temp[i];
                    } else {
                        numbers[i-1] = temp[i];
                    }
                }
            }
            return numbers;
        }
    }
}

