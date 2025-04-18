package programmers.lv0;
import java.util.*;

public class Day15_2 {
    class Solution {
        public int[] solution(int[] array) {
            //sort로 정렬해서 가장 마지막 값을 저장
            //for문돌려서 값이 같을때 i 인덱스값 저장
            int[] answer = new int[2];
            int[] temp = new int[array.length];
            for (int i=0; i<array.length; i++) {
                temp[i] = array[i];
            }
            Arrays.sort(temp);
            answer[0] = temp[array.length-1];
            for (int i=0; i<array.length; i++) {
                //제일 큰수가 0번째 인덱스라면? i-1을 했을때 오류가 발생
                if(answer[0] == array[i]) {
                    if(i==0) {
                        answer[1] = 0;
                    }else {
                        answer[1] = i;
                    }
                }
            }

            return answer;
        }
    }
}
