import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Integer> set = new HashSet<>();
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] arr = br.readLine().split(" ");
            if (arr[0].equals("add")) {
                set.add(Integer.parseInt(arr[1]));
            } else if (arr[0].equals("remove") && set.contains(Integer.parseInt(arr[1]))) {
                set.remove(Integer.parseInt(arr[1]));
            } else if (arr[0].equals("check")) {
                if (set.contains(Integer.parseInt(arr[1]))) {
                    bw.write("1" + "\n");
                } else {
                    bw.write("0" + "\n");
                }
            } else if (arr[0].equals("toggle")) {
                if (set.contains(Integer.parseInt(arr[1]))) {
                    set.remove(Integer.parseInt(arr[1]));
                } else {
                    set.add(Integer.parseInt(arr[1]));
                }
            } else if (arr[0].equals("all")) {
                set.clear();
                for (int j=1; j<=20; j++) {
                    set.add(j);
                }
            } else if (arr[0].equals("empty")) {
                set.clear();
            }
        }
//        bw.write(set.toString() + "\n");
        bw.flush();
    }
}