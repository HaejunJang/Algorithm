import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            String s = br.readLine();
            if (s.contains("push")) {
                stack.push(Integer.parseInt(s.substring(5,s.length())));
            } else if (s.contains("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                }else {
                    System.out.println(stack.pop());
                }
            } else if (s.contains("size")) {
                System.out.println(stack.size());
            } else if (s.contains("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}