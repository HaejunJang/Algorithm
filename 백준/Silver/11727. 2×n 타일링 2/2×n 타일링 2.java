import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //n 1이면 1가지
        //n 2이면 세로 2개, 가로 2개, 2x2 타일 총 3가지
        //n 3이면 마지막에 2x2를 넣는 dp[1], 마지막에 세로넣는 dp[2], 마지막에 가로 넣는 dp[1]
        //n 4이면 마지막에 2x2를 넣는 dp[2], 마지막에 세로넣는 dp[3], 마지막에 가로 넣는 dp[2]
        Scanner sc = new Scanner(System.in);
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 3;
        int n = Integer.parseInt(sc.nextLine());
        for (int i =3; i<1001; i++) {
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-2]) %10007;
        }
        System.out.println(dp[n]);
    }
}