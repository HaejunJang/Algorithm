import java.util.*;
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[][] arr = new String[n][2];
        for(int i=0; i<n; i++) {
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            public int compare(String[] o1, String[] o2) {
                if (Integer.parseInt(o1[0])==Integer.parseInt(o2[0])) {
                    return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
                } else {
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                }
            }
        });
        for (int i=0; i<n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}