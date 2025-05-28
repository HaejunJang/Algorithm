import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        for (int i=Integer.parseInt(input[0]); i<=Integer.parseInt(input[1]); i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int i) {
        if (i ==1) return false;
        for(int j=2; j<=Math.sqrt(i); j++) {
            if (i%j==0) {
                return false;
            }
        }
        return true;
    }
}