import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        //1번 : 12345 반복
        //2번 : 21232425 반복
        //3번 : 3311224455 반복
        
        //전체 문제 끝까지 돌면서 값을 비교
        int one[] = {1,2,3,4,5};
        int two[] = {2,1,2,3,2,4,2,5};
        int three[] = {3,3,1,1,2,2,4,4,5,5};
        //그때마다 count해보기
        int oneCount=0, twoCount=0, threeCount=0;
        for (int i=0; i<answers.length; i++) {
            if(answers[i] == one[i%one.length]) oneCount++;
            if(answers[i] == two[i%two.length]) twoCount++;
            if(answers[i] == three[i%three.length]) threeCount++;
        }
        int max = Math.max(oneCount, Math.max(twoCount,threeCount));
        ArrayList<Integer> list = new ArrayList<>();
        if (max == oneCount) list.add(1);
        if (max == twoCount) list.add(2);
        if (max == threeCount) list.add(3);
        return list.stream().mapToInt(i ->i).toArray();
        
    }
}