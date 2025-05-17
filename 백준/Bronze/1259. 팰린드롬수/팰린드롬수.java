import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= "";
        boolean flag = true;
        while(true) {
            flag = true;
            s = sc.nextLine();
            if(s.equals("0")){
                break;
            }
                for(int i=0; i<s.length()/2; i++) {
                    if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                        flag = false;
                    }
                }
                if(flag) {
                    System.out.println("yes");
                }else {
                    System.out.println("no");
                }
        }
    }
}