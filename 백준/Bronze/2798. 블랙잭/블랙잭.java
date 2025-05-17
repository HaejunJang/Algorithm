import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt();
        int temp1 = 0;
        int temp2 =0;
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i=0; i<arr.length-2; i++) {
            for(int j=i+1; j<arr.length-1; j++) {
                for(int k=j+1; k<arr.length; k++) {
                    temp2 = arr[i] + arr[j] + arr[k];
                    if (temp2 <=max) {
                        if(max-temp1>max-temp2) {
                            temp1 = temp2;
                        }
                    }
                }
            }
        }
        System.out.println(temp1);
    }
}