import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //첫째줄 : 가지고 있는 숫자카드 수
        //둘째줄 : 숫자가 주어짐
        //셋째줄 : 몇 개 가지고있는지 구해야할 숫자의 갯수 주어짐
        //넷째줄 : 구해야할 숫자가 주어짐
//        Scanner sc= new Scanner(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //키값을 숫자, 값을 횟수
        HashMap<Integer,Integer> map = new HashMap<>();
//        int numberCount = sc.nextInt();
        int numberCount = Integer.parseInt(br.readLine());
        String[] numbers;
        numbers = br.readLine().split(" ");
        for (int i=0; i<numberCount; i++) {
            map.put(Integer.parseInt(numbers[i]), map.getOrDefault(Integer.parseInt(numbers[i]), 0) +1);
        }
        int answerCount = Integer.parseInt(br.readLine());
        String[] answerNum = br.readLine().split(" ");
        for (int i=0; i<answerCount; i++) {
            bw.write(map.getOrDefault(Integer.parseInt(answerNum[i]), 0) + " ");
        }
        bw.flush();
        bw.close();
    }
}