package programmers.lv0.basic;

import java.util.*;

public class Day9_5 {

    class Solution {
        public int[] solution(int[] arr) {
            int i=0;
            List<Integer> stk = new ArrayList<>();

            while(i <arr.length) {

                if(stk.isEmpty()) {
                    stk.add(arr[i]);
                    i++;
                    continue;
                }

                if(stk.get(stk.size()-1) <arr[i]) {
                    stk.add(arr[i]);
                    i++;
                    continue;
                }
                if (stk.get(stk.size()-1) >= arr[i]) {
                    stk.remove(stk.size()-1);
                    continue;
                }
            }

            //stream 적용
            int[] answer = stk.stream().mapToInt(a -> a).toArray();
//            int[] answer = new int[stk.size()];
//            for (int a=0; a<stk.size(); a++) {
//                answer[a] = stk.get(a);
//            }
            return answer;
        }
    }
    /* stack으로 풀기
    import java.util.*;
class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i=0;

        while(i<arr.length) {
            if (stack.empty() || stack.peek() < arr[i]) {
                stack.push(arr[i]);
                i++;
            } else if(stack.peek() >= arr[i]) {
                stack.pop();
            }
        }
        return stack;
    }
}
     */

}
