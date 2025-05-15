import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++) {
            int a = sc.nextInt() %42;
            if (!list.contains(a)) {
                list.add(a);
            }
        }
        System.out.println(list.size());
    }
}