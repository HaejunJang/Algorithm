package programmers.lv0.introduction;

public class Day23_5 {
    class Solution {
        public int solution(int[] common) {
            //우선 등차인지 등비인지 구분을 해야해
            //등차인지를 구분하고 아니면 등비로 해서 계산하기
            //등차인지는 0,1,2,3 인덱스 차이값이 같으면 등차
            int answer = 0;
            boolean check = true;
            int gap[] = new int[common.length];

            for(int i=1; i<common.length; i++) {
                gap[i] = common[i] - common[i-1];
                gap[0] = gap[i];
            }
            for(int i=1; i<common.length; i++) {
                if(gap[i] != gap[i-1]) {
                    check = false;
                }
            }
            //등차 수열
            if(check == true) {
                answer = common[common.length-1] + gap[0];
                System.out.println("등차수열 실행");
            } else{
                gap[0] = common[1]/common[0];
                answer = common[common.length-1] * gap[0];
            }


            return answer;
        }
    }
}
