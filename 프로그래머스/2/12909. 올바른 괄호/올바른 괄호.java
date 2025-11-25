import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] arr = s.split("");
        Stack<String> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++) {
            if(stack.isEmpty() && arr[i].equals(")")) {
                return false;
            }
            else if(arr[i].equals("(")) {
                stack.push(arr[i]);
            } else {
                    stack.pop();
                }
            }
        if (stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }
}