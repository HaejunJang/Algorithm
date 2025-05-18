import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = br.readLine().split(" ");
        int answer=  factorial(Integer.parseInt(arr[0]))/factorial(Integer.parseInt(arr[1]))/factorial(Integer.parseInt(arr[0])- Integer.parseInt(arr[1]));
        bw.write(String.valueOf(answer));

        br.close();
        bw.flush();
        bw.close();
    }
    public static int factorial(int n) {
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }
}