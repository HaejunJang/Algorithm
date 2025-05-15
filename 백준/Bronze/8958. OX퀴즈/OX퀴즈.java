import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++) {
            String answer = sc.nextLine();
            int sum =0;
            int stack = 0;
            if(answer.charAt(0) == 'O') {
                sum = 1;
                stack++;
            }
            for(int j=1; j<answer.length(); j++) {
                if(answer.charAt(j) == 'O' && answer.charAt(j-1) == 'O') {
                    stack++;
                    sum += stack;
//                    System.out.println(j + "번째 stack: " + stack + " sum : " + sum);
                } else if(answer.charAt(j) == 'O' && answer.charAt(j-1) == 'X') {
                    stack =1;
                    sum += 1;
//                    System.out.println("단일 더하기 실행 sum: " + sum);
                } else {
                    stack =1;
                }
            }
            System.out.println(sum);
        }
    }
}