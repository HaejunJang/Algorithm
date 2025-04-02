package doIt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No3 {
    public static void main(String[] args) throws IOException {
        /*
        내가 푼 방식
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //N개의 숫자가 올거고
        int M = sc.nextInt();   //M번 계산을 진행
        int[] firstArr = new int[N+1];
        int[] secondArr = new int[N+1];
        int[] answerArr = new int[M];

        for(int i = 1; i < N+1; i++) {
            firstArr[i] = sc.nextInt();
                secondArr[i] = firstArr[i] + secondArr[i-1];
        }

        for(int k = 0; k < M; k++) {
            int i = sc.nextInt(); // 1
            int j = sc.nextInt(); // 3

            answerArr[k] = secondArr[j] - secondArr[i-1];
        }

        for(int i = 0; i < M; i++) {
            System.out.println(answerArr[i]);
        }*/
        //연산이 많을때는 BufferedReader사용하기
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer : 10만개의 숫자를 계속 받을때 int형으로 힘들다
        StringTokenizer stringTokenizer =
                new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        //0번째 인덱스 값을 넣지 않기 위해 +1
        long[] s = new long[suNo + 1]; //long 형을 하는 이유는 int 범위넘는것을 막기 위함
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=1; i <= suNo; i++) {
            s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int q=0; q <quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(s[j]- s[i-1]);
        }
    }
}
