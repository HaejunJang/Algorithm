import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = getGcd(a,b);
        int d = a * b / c;
        System.out.println(c);
        System.out.println(d);
    }
    static int getGcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return getGcd(b, a % b);
    }
}