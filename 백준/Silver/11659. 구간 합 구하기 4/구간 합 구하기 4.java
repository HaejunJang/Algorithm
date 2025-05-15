import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        }
    }
}
