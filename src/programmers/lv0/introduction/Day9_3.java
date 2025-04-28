package programmers.lv0.introduction;

public class Day9_3 {
    class Solution {
        public String solution(String letter) {
            StringBuilder sb = new StringBuilder();
            String answer = "";
            String[] temp = letter.split(" "); //letter문자를 띄어쓰기 빼고 배열에 저장
            String[] mose = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            String[] alpha = {"a", "b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s",
                    "t","u","v","w","x","y","z"};
            int[] answerInt = new int[temp.length];
            //나중에 테스트중에는 공백이 있을 수 있음
            //인덱스값이 들어가 있는 배열

            for(int i=0; i<temp.length; i++) {
                for (int j=0; j<mose.length; j++) {
                    if( temp[i].equals(mose[j])) {
                        answerInt[i] = j;
                    }
                }
            }

            for (int i=0; i<temp.length; i++) {
                sb.append(alpha[(answerInt[i])]);
            }
            answer = sb.toString();
            return answer;
        }
    }
}
