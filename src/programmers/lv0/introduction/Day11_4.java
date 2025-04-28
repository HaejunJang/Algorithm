package programmers.lv0.introduction;

import java.util.ArrayList;
import java.util.List;
//import java.util.Arrays;
import java.util.Collections;

public class Day11_4 {


    class Solution {
        public int[] solution(String my_string) {

            List<Integer> nums = new ArrayList<>();
            for (int i=0; i<my_string.length(); i++) {
                char ch = my_string.charAt(i);
                if (Character.isDigit(ch)) {
                    int num = ch - '0';
                    nums.add(num);
                }
            }
            Collections.sort(nums);
            int[] answer = new int[nums.size()];
            for (int i=0; i<nums.size(); i++) {
                answer[i] = nums.get(i);
            }
            // Arrays.sort(answer);
            return answer;
        }
    }
}
