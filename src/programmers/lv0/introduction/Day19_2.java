package programmers.lv0.introduction;

public class Day19_2 {
    class Solution {
        public int[] solution(String[] keyinput, int[] board) {
            //보드판의 각각의 크기 : board[0] /2, board[1] /2 값
            int x = board[0] /2;
            int y = board[1] /2;
            int[] answer = {0,0};
            for(int i=0; i<keyinput.length; i++) {
                if (keyinput[i].equals("left") &&
                        answer[0] > x * -1) {
                    answer[0] -= 1;
                }else if (keyinput[i].equals("right") &&
                        answer[0] < x) {
                    answer[0] +=1;
                } else if (keyinput[i].equals("up") &&
                        answer[1] < y) {
                    answer[1] += 1;
                } else if (keyinput[i].equals("down") &&
                        answer[1] > y * -1){
                    answer[1] -=1;
                }
            }
            return answer;
        }
    }
}
