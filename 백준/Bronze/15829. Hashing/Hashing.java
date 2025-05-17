import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        int m = 1234567891;
        long sum = 0;
        long power = 1;
        String input = sc.nextLine();
        for(int i=0; i<count; i++) {
            int value = input.charAt(i) - 'a'+1;
            sum = (sum + value * power) %m;
//            sum += value * power % m;
            power = (power * 31) %m;
        }
        System.out.println(sum);
    }
}