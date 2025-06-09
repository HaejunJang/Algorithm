import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        sc.nextLine();
        ArrayList<String> answer = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextLine());
        }
        for (int i = 0; i < m; i++) {
            String temp = sc.nextLine();
            if (set.contains(temp)) {
                count++;
                answer.add(temp);
            }
        }
        System.out.println(count);
        Collections.sort(answer);
        for (String s : answer) {
            System.out.println(s);
        }
    }
}