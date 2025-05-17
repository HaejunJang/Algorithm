import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 문제 수
        for (int i=0; i<count; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[][] arr = new int [x+1][y+1];
            for (int j=0; j<arr.length; j++) {
                for (int k =0; k<y; k++) {
                    if(j ==0) {
                        arr[j][k] = k +1;
//                        System.out.println("j: " + j + ", k: " + k);
//                        System.out.println("0층 확인 : "+arr[j][k]);
                    } else{
//                        System.out.println("다른층 ");
                        for(int a=0; a<=k; a++) {
                            arr[j][k] += arr[j-1][a];
                        }
//                        System.out.println("j: " + j + ", k: " + k);
//                        System.out.println("arr[j][k]값" +arr[j][k]);
                    }
                }
            }
            System.out.println(arr[x][y-1]);
        }
    }
}