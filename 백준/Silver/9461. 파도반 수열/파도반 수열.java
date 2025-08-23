import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] dp = new long[101];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;
        for(int i=6; i<dp.length; i++){
            dp[i] = dp[i-1] + dp[i-5];
        }
        int input = Integer.parseInt(sc.nextLine());
        for (int i=0; i<input; i++){
            System.out.println(dp[Integer.parseInt(sc.nextLine())]);
        }
    }
}