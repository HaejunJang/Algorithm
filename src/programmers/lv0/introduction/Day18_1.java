package programmers.lv0.introduction;

public class Day18_1 {
    public static void main(String[] args) {
        String[] arr = new String[] {"1", "2"," 13"};
        int count = 0;
        for(int i=0; i< arr.length; i++) {
            if (arr[i].contains("1")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
