package programmers.lv0.introduction;
import java.util.*;

public class Day17_4 {
    class Solution {
        public int solution(String before, String after) {
            int answer = 1;
            String[] beArr = before.split("");
            String[] afArr = after.split("");

            Arrays.sort(beArr);
            Arrays.sort(afArr);

            for(int i=0; i<beArr.length; i++) {
                if(!beArr[i].equals(afArr[i])) return 0;
            }
            return answer;
        }
    }
}
