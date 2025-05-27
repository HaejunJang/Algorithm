import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        int x = (int)Math.round(count *0.15);
        int sum =0;
        for (int i = x; i < count-x; i++) {
            sum += list.get(i);
        }
        int answer = (int)Math.round((double)sum/(count-2*x));
        bw.write(answer + "\n");
        bw.flush();
    }
}