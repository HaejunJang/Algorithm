package programmers.lv0;

public class Day5_1 {
    public int solution(int price) {
        int answer = 0;
        /*
         if (price <100000) {
             answer = price;
         } else if ( 100000 <= price && price < 300000) {
             answer = (int)(price * 0.95);
         } else if ( 300000 <= price && price < 500000) {
             temp = (int)(price * 0.9);
         } else  (price >= 500000) {
             temp = (int)(price * 0.8);
         }
        */
        //삼항연산자로 풀어보기
        answer = (int)(
                price >= 500000 ? price * 0.8 :
                        price >= 300000 ? price * 0.9 :
                                price >= 100000 ? price * 0.95:
                                        price);
        return answer;

        //바로 return 시키기
        // class Solution {
        //    public int solution(int price) {
        //
        //        if (price >= 500000) return (int)(price * 0.8);
        //        else if (price >= 300000) return (int)(price * 0.9);
        //        else if (price >= 100000) return (int)(price * 0.95);
        //        else return price;
        //    }
        //}
    }
}
