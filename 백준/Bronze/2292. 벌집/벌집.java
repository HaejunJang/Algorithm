import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        //한바퀴 돌때마다 6 12 18 24 가 더해진 범위안에 있는지 체크
        int range = 1;
        int stack =0;
        int answer =1;
        while (true) {
            if(n <=range) {
                break;
            }else {
                stack +=6;
                range = range + stack;
                answer++;
            }
        }
        System.out.println(answer);
    }
}