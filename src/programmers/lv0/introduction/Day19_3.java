package programmers.lv0.introduction;

public class Day19_3 {
    class Solution {
        public String solution(String polynomial) {
            //우선 split(" ") 으로 구분하고
            //contains해서 x값이 있으면 그앞의 숫자를 어떻게 가져올까?
            String[] arr = polynomial.split(" ");
            int xNum = 0;
            int yNum = 0;
            String answer = "";
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<arr.length; i+=2) {
                if(arr[i].contains("x")) {
                    if (arr[i].substring(0, arr[i].indexOf("x")).equals("")) {
                        xNum +=1;
                    } else {
                        xNum += Integer.parseInt(arr[i].substring(0, arr[i].indexOf("x")));
                    }
                } else {
                    yNum += Integer.parseInt(arr[i]);
                }
            }

            if (xNum != 0 && xNum != 1) {
                sb.append(String.valueOf(xNum) + "x");
            } else if( xNum != 0 && xNum ==1) {
                sb.append("x");
            }
            if( yNum != 0 && xNum != 0) {
                sb.append(" + ");
                sb.append(String.valueOf(yNum));
            } else if ( yNum !=0 && xNum ==0) {
                sb.append(String.valueOf(yNum));
            }
            answer = sb.toString();

            return answer;
        }
    }
}
