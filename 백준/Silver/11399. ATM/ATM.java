import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //3 1 4 3 2
        //작은순으로 정렬
        //1 2 3 3 4
        //1 3 6 9 13 -> 32
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum =0;
        int stack =0;
        for(int i=0; i<arr.length; i++){
            stack += arr[i];
            sum += stack;
        }
        System.out.println(sum);
    }
}