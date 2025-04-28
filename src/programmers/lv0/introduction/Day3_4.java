package programmers.lv0.introduction;

import java.util.ArrayList;

public class Day3_4 {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i <=n; i++) {
            if ( i%2 ==1) {
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
