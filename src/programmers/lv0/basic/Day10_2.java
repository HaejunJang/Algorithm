package programmers.lv0.basic;

import java.util.*;

public class Day10_2 {
    //map 사용하기
    class Solution {
        public int solution(int a, int b, int c, int d) {
            Map<Integer, Integer> map = new HashMap<>();
            for( int num : new int[] {a,b,c,d}) {
                map.put(num, map.getOrDefault(num, 0) +1);
            }
            int size = map.size();

            if (size == 1) {
                return 1111 * a;
            }

            if (size == 2) {
                // 3 1
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() == 3) {
                        int p = entry.getKey();
                        int q = 0;
                        for (int key : map.keySet()) {
                            if (key != p) q = key;
                        }
                        return (int) Math.pow(10 * p + q, 2);
                    }
                }
                // 2 2
                int[] keys = new int[2];
                int idx = 0;
                for (int key : map.keySet()) {
                    keys[idx++] = key;
                }
                return (keys[0] + keys[1]) * Math.abs(keys[0] - keys[1]);
            }

            if (size == 3) {
                // 2 1 1
                int pair = 0;
                int[] rest = new int[2];
                int idx = 0;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue()==2) {
                        pair = entry.getKey();
                    } else {
                        rest[idx++] = entry.getKey();
                    }
                }
                return rest[0] * rest[1];
            }
            return Math.min(Math.min(a,b), Math.min(c,d));
        }
    }
    /*
    class Solution {
        public int solution(int a, int b, int c, int d) {
            int[] count = new int[7];
            count[a]++; count[b]++; count[c]++; count[d]++;
            int maxCount =0;
            int maxNum = 0;
            ArrayList<Integer> pair = new ArrayList<>();
            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0; i<count.length; i++) {
                if(maxCount<count[i]) {
                    maxCount = count[i];
                    maxNum = i;
                }
            }

            if (maxCount == 4) {
                return maxNum * 1111;
            } else if( maxCount == 3) {
                for(int i=0; i<count.length; i++) {
                    if(count[i] == 1) {
                        return (10 * maxNum + i) * (10 * maxNum + i);
                    }
                }
            } else if( maxCount == 2) {
                for(int i=0; i<count.length; i++) {
                    if(count[i] == 2) {
                        pair.add(i);
                    }
                }
                // 2 2 같을때
                if (pair.size() == 2) {
                    return (pair.get(0) + pair.get(1)) * Math.abs(pair.get(0) - pair.get(1));
                }
                //2 1 1일때
                else if (pair.size() == 1) {
                    for(int i=0; i<count.length; i++) {
                        if (count[i] == 1) {
                            list.add(i);
                        }
                    }
                    return list.get(0) * list.get(1);
                }
            } else {
                return Math.min(Math.min(a,b), Math.min(c,d));
            }
            return 0;
        }
    }
    */

}
