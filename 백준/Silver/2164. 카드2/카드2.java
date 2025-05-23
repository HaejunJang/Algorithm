import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        for (int i=1; i<=n; i++) {
            deque.add(i);
        }
        while (true) {
            if (deque.size() == 1) {
                break;
            }
            deque.removeFirst();
            int first = deque.getFirst();
            deque.addLast(first);
            deque.removeFirst();
        }
        System.out.println(deque.peek());
    }
}