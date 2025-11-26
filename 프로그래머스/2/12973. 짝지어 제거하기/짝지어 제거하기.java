import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = remove(s);
        return answer;
    }
    
    private int remove(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i=0; i<chars.length; i++) {
            if (!stack.isEmpty() && stack.peek() == chars[i]) {
                stack.pop();
            } else if (stack.isEmpty()) {
                stack.push(chars[i]);
            } else if (!stack.isEmpty() && stack.peek() != chars[i]) {
                stack.push(chars[i]);
            }
        }
        return stack.size() >=1 ? 0 : 1;
    }
}