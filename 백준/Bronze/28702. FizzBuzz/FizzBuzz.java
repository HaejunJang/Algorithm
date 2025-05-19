import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        String n2 = br.readLine();
        String n3 = br.readLine();

        int lastNumber = 0;

        // 마지막 값이 숫자인 경우
        if (!n3.equals("Fizz") && !n3.equals("Buzz") && !n3.equals("FizzBuzz")) {
            lastNumber = Integer.parseInt(n3);
        } else if (!n2.equals("Fizz") && !n2.equals("Buzz") && !n2.equals("FizzBuzz")) {
            lastNumber = Integer.parseInt(n2) + 1;
        } else if (!n.equals("Fizz") && !n.equals("Buzz") && !n.equals("FizzBuzz")) {
            lastNumber = Integer.parseInt(n) + 2;
        }

        // 다음 값 계산
        lastNumber++;
        if (lastNumber % 3 == 0 && lastNumber % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (lastNumber % 3 == 0) {
            System.out.println("Fizz");
        } else if (lastNumber % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(lastNumber);
        }

        br.close();
    }
}