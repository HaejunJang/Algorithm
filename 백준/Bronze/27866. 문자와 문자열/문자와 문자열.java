import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int idx = sc.nextInt();
        System.out.println(x.substring(idx-1, idx));
    }
}