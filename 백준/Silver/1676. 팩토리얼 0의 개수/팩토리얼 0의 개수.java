import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int tCount = 0;
        int fCount = 0;
        for (int i=n; i>0; i--) {
            int num =i;
            while (num % 2 == 0) {
                num /=2;
                tCount++;
            }
            while (num % 5 ==0) {
                num /=5;
                fCount++;
            }
        }
        System.out.println(Math.min(tCount, fCount));
    }
}