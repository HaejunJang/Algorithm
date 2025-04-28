package programmers.lv0.basic;
import java.util.Scanner;

public class Day2_2 {
    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n%2 == 0) {
                System.out.println(n + " is even");
            } else{
                System.out.println(n + " is odd");
            }
        }
    }
}
