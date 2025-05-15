import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //계산 수

        for(int i=0; i<a; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            int floor = (n % h ==0) ? h : n%h;
            int bang = (n % h ==0) ? (n/h) : (n / h) + 1;
            System.out.println(floor * 100 + bang);
        }
    }
}