package programmers.lv0;

public class Day22_4 {
    class Solution {
        public int solution(int chicken) {
            int totalCount = 0;   // 전체 서비스 치킨 수
            int coupon = chicken; // 초기에 시킨 치킨 수 = 쿠폰 수

            // 쿠폰이 10장 이상일 때 반복
            while (coupon >= 10) {
                int serviceChicken = coupon / 10;  // 이번에 받을 서비스 치킨 수
                totalCount += serviceChicken;      // 서비스 치킨 누적
                coupon = coupon % 10 + serviceChicken;  // 남은 쿠폰 + 새로 받은 쿠폰
            }

            return totalCount;
        }
    }
}