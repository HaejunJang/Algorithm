import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean flag = true;

        for(int i=1; i< n; i++) {
            int number = i;
            int sum =0;

            while (number != 0) {
                sum += number % 10;
                number /=10;
            }
            if(sum + i == n) {
                System.out.println(i);
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println(0);
        }
    }
}