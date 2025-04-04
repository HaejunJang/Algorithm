package programmers.lv0;

public class Day4_2 {
    public int solution(int n) {
        int answer = 1;
        while(true) {
            if (answer * 6 % n == 0) {
                break;
            }
            answer++;
        }
        return answer;
    }
}
