package programmers.lv0.introduction;

public class Day14_2 {

    class Solution {
        public long solution(String numbers) {
            long answer = 0;
            String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            //for문으로 nums배열을 돌면서 replace를 실행
            for(int i=0; i<nums.length; i++) {
                numbers = numbers.replace(nums[i], String.valueOf(i));
            }
            answer = Long.parseLong(numbers);
            return answer;
        }
    }
    /*
    //초기 풀이법
    class Solution {
        public long solution(String numbers) {
            long answer = 0;
            // Map<String, String> map = new HashMap<>();
            // map.
            numbers = numbers.replace("zero", "0");
            numbers = numbers.replace("one","1");
            numbers = numbers.replace("two","2");
            numbers = numbers.replace("three","3");
            numbers = numbers.replace("four","4");
            numbers = numbers.replace("five","5");
            numbers = numbers.replace("six","6");
            numbers = numbers.replace("seven","7");
            numbers = numbers.replace("eight","8");
            numbers = numbers.replace("nine","9");

            answer = Long.parseLong(numbers);
            return answer;

        }
    }
*/
    /* //map활용해보기
    import java.util.*;
class Solution {
    public long solution(String numbers) {
        Map<String, String> map = new HashMap<>();
        long answer = 0;

        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        for(String key : map.keySet()) {
            numbers = numbers.replace(key,map.get(key));
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}
     */
}
