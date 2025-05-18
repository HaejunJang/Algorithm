import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력 최적화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //출력 최적화
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] count = new int[10001]; //1부터 10000까지 카운팅

        //숫자 개수 세기
        for(int i =0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }

        //오름차순으로 출력
        for (int i=1; i<=10000; i++) {
            while (count[i]-- > 0) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}