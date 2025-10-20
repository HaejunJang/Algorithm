import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int startIdx = commands[i][0]; //1
            int endIdx = commands[i][1]; //7
            int[] temp = new int[endIdx - startIdx + 1]; //7

            for (int j=startIdx; j<=endIdx; j++) {
                temp[j-startIdx] = array[j-1]; //6,6
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        for(int i=0; i<answer.length; i++) {
            System.out.println(answer[i]);
        }
    return answer;
    }
}