package programmers.lv0;

public class Day9_4 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String rsp) {
                //for문 돌면서 문자를 비교 하고
                //빌더를 통해서 값을 더한뒤 반환
                StringBuilder sb = new StringBuilder();
                for (int i=0; i< rsp.length(); i++) {
                    if (rsp.substring(i,i+1).equals("2")) {
                        sb.append("0");
                    } else if (rsp.substring(i,i+1).equals("0")) {
                        sb.append("5");
                    } else {
                        sb.append("2");
                    }
                }
                String answer = sb.toString();
                return answer;
            }
        }
    }
}
