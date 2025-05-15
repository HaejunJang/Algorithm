import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int count =0;
        for(int i=0; i<num; i++) {
            int x = sc.nextInt();
            boolean flag = true;

            if (x <2) {
                flag = false;
            } else {
                for (int j=2; j<=Math.sqrt(x); j++) {
                    if (x % j == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
    }
}