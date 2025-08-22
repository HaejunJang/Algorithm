import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //기본적으로 풀어보자
        //우선 테스트 케이스 수 입력받고
        //숫자가 주어지면 작은수부터 케이스 시작
        int[] dp = new int[12];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i=4; i<dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        for (int i=0; i<input; i++){
            int result = sc.nextInt();
            System.out.println(dp[result]);
        }
    }
}