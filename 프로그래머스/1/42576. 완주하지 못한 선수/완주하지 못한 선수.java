import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        //참가자 명단을 어디에 저장할까?
        //map에 저장?
        HashMap<String, Integer> map = new HashMap<>();
        String answer = "";
        for (int i=0; i<participant.length; i++) {
            map.put(participant[i],map.getOrDefault(participant[i],0) + 1);
        }
        for (int i=0; i<completion.length; i++) {
            String key = completion[i];
            map.put(key, map.get(key)-1);
        }
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                answer = entry.getKey();
            }
        }
        return answer;
    }
}