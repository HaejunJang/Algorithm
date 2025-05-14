import java.util.*;
public class Main{   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= 0;
        int sum =0;
        for(int i=0; i<5; i++) {
            x = sc.nextInt();
            sum += x*x;
        }
        System.out.println(sum%10);
    }
}    
    