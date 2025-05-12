package programmers.lv0.basic;
import java.time.LocalDate;

public class Day22_3 {

    class Solution {

        public int solution(int[] date1, int[] date2) {

            LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
            LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);

            if (dateA.isBefore(dateB)) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    /*
    class Solution {
        public int solution(int[] date1, int[] date2) {
            if(date1[0] < date2[0]) {
                return 1;
            }
            if (date1[0] == date2[0] && date1[1] < date2[1]) {
                return 1;
            }
            if (date1[0] == date2[0] && date1[1] == date2[1] && date1[2] < date2[2]) {
                return 1;
            }
            return 0;
        }
    }
    */
}
