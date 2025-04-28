package programmers.lv0;

public class Day23_4 {
    class Solution {
        public int[] solution(int num, int total) {
            int[] answer = new int[num];
            int startNum=0;
            //num이 홀수일때
            if(num%2 != 0) {
                startNum = total/num - num/2;

            }else {
                //num이 짝수일때
                startNum = total/num - (num/2 -1);
                System.out.println("짝수일때 시작값: " + startNum);
            }
            for(int i=0; i<answer.length; i++) {
                answer[i] = startNum;
                startNum++;
            }
            return answer;
        }
    }
}
