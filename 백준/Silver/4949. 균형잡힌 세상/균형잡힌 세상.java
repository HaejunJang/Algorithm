import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if ( ch == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isBalanced = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isBalanced = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (isBalanced && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}