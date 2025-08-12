import java.util.*;

public class Main {
    public static void main(String[] args)  {
        //어떻게 최대점수를 구할까?
        //dp를 사용하여 i번째 계단까지 왔을때 얻을 수 있는 최대 점수
        //i번째 마지막 계단은 무조건 밟는 경우로 생각해야함
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] score = new int[count+1];
        int[] dp = new int[count+1];
        for (int i=1; i<score.length; i++) {
            score[i] = sc.nextInt();
        }
        dp[0] = 0;
        dp[1]=score[1];
        if (count >= 2) {
            dp[2] = score[1] + score[2];
        }
        if (count>=3) {
            dp[3]=Math.max(score[1]+score[3], score[2]+score[3]);
        }
        //4번째 가능경우
        //1,3,4 / 2,4
        //dp3 + 4 / dp2 + 4
        for (int i=4; i<dp.length; i++) {
            dp[i]=Math.max(dp[i-2] + score[i], dp[i-3] + score[i-1] + score[i]);
        }
        System.out.println(dp[dp.length-1]);
    }
}