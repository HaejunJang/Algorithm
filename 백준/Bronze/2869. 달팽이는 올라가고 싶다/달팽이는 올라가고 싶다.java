import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt(); // 문제 수
        int down = sc.nextInt();
        int length = sc.nextInt();

        int count = (int) Math.ceil((double) (length - up) / (up - down)) + 1;
        System.out.println(count);
    }
}