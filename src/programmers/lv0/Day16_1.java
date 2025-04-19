package programmers.lv0;

public class Day16_1 {
    class Solution {
        public String[] solution(String[] quiz) {
            //quiz는 배열이다 그냥 인덱스로 접근해서 각 계산 결과를 반환
            //또 그 배열 안에서 " " 로 split해서 저장한 다음
            //해당 값을 계산해서 맞으면 O 틀리면 X 저장하기
            String[] answer = new String[quiz.length];
            String[] temp = {};
            for (int i=0; i<quiz.length; i++) {
                temp = quiz[i].split(" ");
                if(temp[1].equals("+")) {
                    int num1 = Integer.parseInt(temp[0]);
                    int num2 = Integer.parseInt(temp[2]);
                    int num3 = Integer.parseInt(temp[4]);
                    if(num1 +num2 == num3) {
                        answer[i] = "O";
                    } else{
                        answer[i] = "X";
                    }
                } else {
                    int num1 = Integer.parseInt(temp[0]);
                    int num2 = Integer.parseInt(temp[2]);
                    int num3 = Integer.parseInt(temp[4]);
                    if(num1 - num2 == num3) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }
                }
            }
            return answer;
        }
    }
}
