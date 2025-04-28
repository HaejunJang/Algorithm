package programmers.lv0;

public class Day23_2 {
    class Solution {
        public int solution(String A, String B) {
            //length()-1번 반복하며 문자 옮기고 B와 체크
            //같다면 count, 안되면 -1
            int answer = 0;
            String temp = "";
            String remain = "";
            for(int i=0; i<A.length(); i++) {
                if(B.equals(A)) {
                    return answer;
                }
                temp = A.substring(A.length()-1);
                remain = A.substring(0, A.length()-1);
                remain = temp + remain;
                System.out.println(remain);
                A = remain;
                answer++;
            }
            return -1;

        }
    }
    /*
    //개선해보기
    class Solution {
    public int solution(String A, String B) {
        for(int i=0; i<A.length(); i++) {
            if (A.equals(B)) {
                return i;
            }
            //A를 오른쪽 회전
            A = A.substring(A.length()-1) + A.substring(0,A.length()-1);
        }
        return -1;
    }
}
     */


}
