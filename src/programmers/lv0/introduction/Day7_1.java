package programmers.lv0.introduction;

public class Day7_1 {
    public String solution(String my_string) {
        /*
        StringBuilder sb = new StringBuilder(my_string);

        // String answer = "";
        for (int i=sb.length()-1; i>=0; i--) {
            if(sb.charAt(i) ==('a') ||
                    sb.charAt(i) == ('e') ||
                    sb.charAt(i) == ('i') ||
                    sb.charAt(i) == ('o') ||
                    sb.charAt(i) == ('u')
            ) {
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }
    */
        //replcaeAll 활용
        String answer = "";
        answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}
