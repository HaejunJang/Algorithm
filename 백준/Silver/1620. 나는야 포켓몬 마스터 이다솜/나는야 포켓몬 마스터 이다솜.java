import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        int matter = sc.nextInt();
        int solve = sc.nextInt();
        sc.nextLine();
        String[] arr =new String[matter];

        for (int i = 1; i <= matter; i++) {
            String name = sc.nextLine();
            map.put(name, i);
            arr[i-1] = name;
        }

        for (int i=0; i<solve; i++) {
            String answer = sc.nextLine();
            if (Character.isDigit(answer.charAt(0))) {
                System.out.println(arr[Integer.parseInt(answer)-1]);
            }else {
                System.out.println(map.get(answer));
            }
        }
    }
}