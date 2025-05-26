import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            map.put(Integer.parseInt(input[i]), map.getOrDefault(Integer.parseInt(input[i]), 0)+1);
        }
        int count = Integer.parseInt(br.readLine());
        String[] output = br.readLine().split(" ");
        for (int i = 0; i < count; i++) {
            bw.write(map.getOrDefault(Integer.parseInt(output[i]), 0) + " ");
        }
        bw.flush();
    }
}