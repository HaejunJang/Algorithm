import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            for (int j=0; j<s.length(); j++) {
                char c = s.charAt(j);
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')' && !stack.isEmpty()) {
                    stack.pop();
                } else if (c == ')' && stack.isEmpty()) {
                    stack.push(c);
                    break;
                }
            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}