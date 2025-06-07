import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nums = sc.nextLine().split("");
        int sum = 0;
        int area = 0;
        int answer = 0;
        int last = Integer.parseInt(nums[nums.length - 1]);

        // 누락된 자리 외 가중치 합 계산
        for (int i = 0; i < nums.length - 1; i++) {
            if (!nums[i].equals("*") && i % 2 != 0) {
                sum += Integer.parseInt(nums[i]) * 3;
            } else if (!nums[i].equals("*") && i % 2 == 0) {
                sum += Integer.parseInt(nums[i]);
            } else {
                area = i;  // * 위치 기억
            }
        }

        int weight = (area % 2 == 0) ? 1 : 3;

        if (weight == 1) {
            answer = (10 - (sum + last) % 10) % 10;
        } else {
            // weight == 3인 경우: 역원 7 곱해줘야 함
            int rightSide = (10 - (sum + last) % 10) % 10;
            answer = (rightSide * 7) % 10;
        }

        System.out.println(answer);
    }
}