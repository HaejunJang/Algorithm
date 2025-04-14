package programmers.lv0;
import java.util.Stack;

public class Day12_3 {
    class Solution {
        public int solution(String s) {
            //split(" ")를 해서 배열 반환 받고
            //배열의 값을 i번째 부터 반복해서 만약 i번째가 숫자이고 i +1번째가 Z가 아니라면 더하고 i +1번째까 Z라면 패스
            int answer = 0;
            String[] answerArr = s.split(" ");
            for (int i=0; i<answerArr.length; i++) {
                if (i != answerArr.length-1) {
                    if (!answerArr[i].equals("Z") && !answerArr[i+1].equals("Z")) {
                        answer += Integer.parseInt(answerArr[i]);
                    }
                }
                if (i == answerArr.length-1 && !answerArr[i].equals("Z")) {
                    answer += Integer.parseInt(answerArr[i]);
                }
            }

            return answer;
        }
    }
    /*
    //아래는 Stack으로 풀기
    class Solution {
        public int solution(String s) {
            int answer = 0;
            Stack<Integer> nums = new Stack<>();
            for(String w : s.split(" ")){
                if(w.equals("Z") && !nums.isEmpty()) {
                    nums.pop();
                } else {
                    nums.push(Integer.parseInt(w));
                }
            }
            // String[] arr = s.split(" ");
            // for (int i=0; i<arr.length; i++) {
            //     if (arr[i].equals("Z") && !nums.isEmpty()){
            //         nums.pop();
            //     }else {
            //         nums.push(Integer.parseInt(arr[i]));
            //     }
            // }
        /*
        while (true) {
            if (nums.isEmpty()) {
                break;
            }
            answer += nums.pop();
        }
        */
//            for (int i : nums) {
//                answer += i;
//            }
//            return answer;
//        }
//    }
}
