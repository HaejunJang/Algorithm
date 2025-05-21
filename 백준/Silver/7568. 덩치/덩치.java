import java.util.*;
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] arr = new int [n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            int rank =1;
            for (int j=i+1; j<n; j++ ){
                if (arr[i][0] <arr[j][0] && arr[i][1] <arr[j][1]) {
                    rank++;
                }
            }
            for (int k=i-1; k>=0; k--){
                if (arr[i][0] < arr[k][0] && arr[i][1] < arr[k][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}