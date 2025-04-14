package programmers.lv0;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Day12_2 {


    class Solution {
        public int[] solution(int n) {
            //1보다 큰수를 +1씩 하면서 %계산결과가 0이면 해당 값으로 나누고
            //나눈값을 list에 추가 이때 값이 중복되는지 체크하고 없으면 넣기
            //n의 값이 1이 되었을때 break;
            //list정렬 후 int 배열로 바꿔서 반환
            int x=2;
            List<Integer> list = new ArrayList<>();
            while (true) {
                if (n ==1) {
                    break;
                }
                if (n % x == 0) {
                    while (true) {
                        if (n % x != 0) {
                            break;
                        }
                        n = n / x;
                    }
                    list.add(x);
                }
                x++;
            }
            Collections.sort(list);
            int[] answer = new int[list.size()];
            for (int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
