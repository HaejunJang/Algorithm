package programmers.lv0;

public class Day20_3 {
    class Solution {
        public int solution(String[] spell, String[] dic) {
            //dic에 있는 단어 한번씩 spell에 있는 단어가 contains로 있는지 검사하고
            //검사후에 단어길이를 검사해서 spell.length랑 같으면 1
            int answer = 2;
            int count =0;
            for(int i=0; i<dic.length; i++) {
                count = 0;
                for(int j=0; j<spell.length; j++) {
                    if(dic[i].contains(spell[j])) {
                        count++;
                    }
                }
                if(count == spell.length) answer = 1;
            }
            return answer;
        }
    }
}
