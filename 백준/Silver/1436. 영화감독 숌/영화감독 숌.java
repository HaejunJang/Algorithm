import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int x =666;
        int count = 1;

        while (count != n) {
            x++;

            if(String.valueOf(x).contains("666")) {
                count++;
            }
        }
        System.out.println(x);
    }
}