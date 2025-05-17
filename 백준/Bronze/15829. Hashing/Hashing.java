import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        int sum = 0;
        String input = sc.nextLine();
        for(int i=0; i<input.length(); i++) {
            sum += (input.charAt(i) -'a' +1) * Math.pow(31,i);
        }
        System.out.println(sum);
    }
}