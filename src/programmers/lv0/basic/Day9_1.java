package programmers.lv0.basic;

import java.util.*;

public class Day9_1 {
    class Solution {
        public int[] solution(int l, int r) {
            List<Integer> result = new ArrayList<>();
            Queue<String> queue = new LinkedList<>();

            // "0"으로 시작하지 않도록 "5"부터 시작
            queue.offer("5");

            while (!queue.isEmpty()) {
                String current = queue.poll();
                System.out.println("현재값 체크: " + current);
                int num = Integer.parseInt(current);

                if (num > r) continue;
                if (num >= l) result.add(num);

                // 다음 숫자 생성
                queue.offer(current + "0");
                queue.offer(current + "5");
            }

            // 결과가 없으면 -1을 담은 배열 반환
            if (result.isEmpty()) return new int[]{-1};

            // List를 int[]로 변환
            int[] answer = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }

            return answer;
        }
    }
}
