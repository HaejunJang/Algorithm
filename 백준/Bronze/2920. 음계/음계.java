import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int[] ascArr = {1,2,3,4,5,6,7,8};
        int[] descArr = {8,7,6,5,4,3,2,1};
        for (int i=0; i<8; i++) {
            arr[i] = sc.nextInt();
        }
        if (Arrays.equals(ascArr, arr)) {
            System.out.println("ascending");
        }else if( Arrays.equals(descArr, arr)) {
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }
    }
}