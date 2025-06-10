import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int total = sc.nextInt();
        int count =0;
        int[] arr = new int[size];

        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i=size-1; i>=0; i--) {
            if (total >= arr[i]) {
                count += (total/arr[i]);
                total = total - (total/arr[i]) * arr[i];
//                System.out.println("total값 확인: " + total);
//                System.out.println("arr확인 : " +arr[i]);
//                System.out.println("count 확인 : " + count);
            }
        }
        System.out.println(count);
    }
}