package programmers.lv0.introduction;

public class Day20_1 {
    /*
    class Solution {

        public int solution(int[][] board) {
            //상 하 좌 우 대각선 위치를 어떻게 판별?
            //그냥 무식하게 1이 발견되면 board를 복사한 배열에서 숫자1로바꾸기
            //복사 방법은 board.clone();
            //만약 없는 인덱스는 어떻게 처리해?
            int answer = 0;
            int[][] map = new int[board.length][board.length];
            for (int i=0; i<board.length; i++) {
                for (int j=0; j<board[i].length; j++) {
                    map[i][j] = board[i][j];
                }
            }

            for(int i=0; i<board.length; i++) {
                for(int j=0; j<board[i].length; j++) {
                    if(board[i][j] == 1) {

                        map[i][j] =1;
                        if(j-1>=0) {
                            map[i][j-1] = 1;
                        }
                        if (j+1 <board[i].length) {
                            map[i][j+1] = 1;
                        }

                        if(i-1>=0) {
                            map[i-1][j] = 1;
                        }
                        if(i-1>=0 && j-1 >=0) {
                            map[i-1][j-1] =1;
                        }
                        if(i-1>=0 && j+1 <board[i].length) {
                            map[i-1][j+1] =1;
                        }

                        if(i+1<board.length) {
                            map[i+1][j] =1;
                        }
                        if(i+1 < board.length && j-1 >=0) {
                            map[i+1][j-1] = 1;
                        }
                        if(i+1<board.length && j+1 < board[i].length) {
                            map[i+1][j+1] = 1;
                        }
                    }
                }
            }
            for(int i=0; i<map.length; i++) {
                for (int j=0; j<map[i].length; j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }

            for(int i=0; i<map.length; i++) {
                for (int j=0; j<map[i].length; j++) {
                    if(map[i][j] == 0) {
                        answer++;
                    }
                }
            }

            return answer;
        }
    }*/
}
