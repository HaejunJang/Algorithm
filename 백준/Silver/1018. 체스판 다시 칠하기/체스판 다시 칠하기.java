import java.util.*;
public class Main {
    public static boolean[][] arr;
    public static int min =64;
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        arr = new boolean[n][m];
        for (int i=0; i<arr.length; i++) {
            String line = sc.nextLine();
            for (int j=0; j<arr[i].length; j++) {
                if (line.charAt(j) == 'W') {
                    arr[i][j] = true;
                }else {
                    arr[i][j] = false;
                }
            }
        }
        int n_length = n -7;
        int m_length = m -7;
        for (int i=0; i<n_length; i++) {
            for (int j=0; j<m_length; j++) {
                countCheck(i,j);
            }
        }
        System.out.println(min);
    }

    private static void countCheck(int i, int j) {
        int end_i = i+8;
        int end_j = j+8;
        int count =0;

        boolean TF = arr[i][j];

        for (int x = i; x<end_i; x++) {
            for (int y = j; y<end_j; y++) {

                if (arr[x][y] != TF) {
                    count++;
                }
                TF = !TF;
            }
            TF = !TF;
        }
        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}