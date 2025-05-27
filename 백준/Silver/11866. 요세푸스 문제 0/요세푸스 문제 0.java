import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();

        String[] s = br.readLine().split(" ");
        int x= Integer.parseInt(s[0]);
        int y= Integer.parseInt(s[1]);
        for (int i=1; i<=x; i++) {
            list.add(i);
        }
        //1,2,3,4,5
        //인덱스는 0123
        bw.write("<");
        int idx =0;
        for (int i=0; i<x; i++) {
            idx = (idx + (y-1)) % list.size();
            if (i == 0) {
                bw.write(list.get(idx) + "");
                list.remove(idx);
            } else {
                bw.write(", " + list.get(idx));
                list.remove(idx);
            }
        }
        bw.write(">");
        bw.flush();
    }
}