import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //map에 키 벨류값으로 저장
        Scanner sc = new Scanner(System.in);
        int problem = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < problem; i++) {
            int items = Integer.parseInt(sc.nextLine());
            HashMap<String, Integer> map = new HashMap<>();
            for (int j=0; j<items; j++){
                String category = sc.nextLine().split(" ")[1];
                map.put(category, map.getOrDefault(category, 0) +1);
            }
            int result = 1;
            for (int count : map.values()) {
                result *= (count +1);
            }
            result -=1;
            System.out.println(result);
        }
    }
}