import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];

        int sum = 0;
        for (int i = 0; i < count; i++) {
            int temp = Integer.parseInt(br.readLine());
            arr[i] = temp;
            sum += temp;
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        Arrays.sort(arr); 

        int avg = Math.round((float) sum / count);
        System.out.println(avg);

        int center = arr[count / 2];
        System.out.println(center);

        int maxFreq = 0;
        for (int v : map.values()) {
            if (v > maxFreq) {
                maxFreq = v;
            }
        }

        List<Integer> modeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modeList.add(entry.getKey());
            }
        }

        Collections.sort(modeList);
        int modeResult = (modeList.size() > 1) ? modeList.get(1) : modeList.get(0);
        System.out.println(modeResult);

        int range = arr[count - 1] - arr[0];
        System.out.println(range);
    }
}