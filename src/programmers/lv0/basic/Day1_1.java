package programmers.lv0.basic;
import java.util.Scanner;

public class Day1_1 {

    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            String answer = "";
            char[] charArr = a.toCharArray();
            for(int i=0; i<charArr.length; i++) {
                if(Character.isUpperCase(charArr[i]) == true) {
                    answer += String.valueOf(charArr[i]).toLowerCase();
                } else{
                    answer += String.valueOf(charArr[i]).toUpperCase();
                }
            }
            System.out.println(answer);
        }
    }
}
