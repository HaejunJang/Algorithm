import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[9];
        int[] answer = new int[2];
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<nums.length; i++){
            nums[i] = sc.nextInt();
            if(nums[i] >answer[0]) {
                answer[0] = nums[i];
                answer[1] = i;
            }
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]+1);
    }
}