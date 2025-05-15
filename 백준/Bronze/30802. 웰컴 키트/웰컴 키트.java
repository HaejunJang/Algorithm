import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        티셔츠는 남아도 된다
        펜은 정확하게
        티셔츠는 T장씩 몇 묶음 주문인지, 펜은 P자루씩 몇 묶음 + 개별 자루
        1. 참가자 수
        2. 각 사이즈별 인원수
        3. 티, 연필 묶음당 몇개인지

        출력
        티셔츠 몇 묶음 사는지
        펜 몇 묶음, 개별 몇개인지
         */
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] tokens = sc.nextLine().split(" ");
        int[] arr = new int[6]; //사이즈별 저장소
        for (int i=0; i<6; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        int t = sc.nextInt(); //티 묶음 수
        int p = sc.nextInt(); //펜 묶음 수
        int tSum = 0;
        int pSum = num /p;
        int pSum2 =num % p; //펜 낱개

        for(int i=0; i<6; i++) {
            if (arr[i] % t == 0) {
                tSum += arr[i] /t;
            }else {
                tSum += arr[i] /t +1;
            }
        }
        System.out.println(tSum);
        System.out.println(pSum + " " + pSum2);
    }
}