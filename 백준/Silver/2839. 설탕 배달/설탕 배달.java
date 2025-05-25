import java.io.*;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int count =0;
        boolean flag = true;
        //5로 나눈 값만큼 x - 5 * 나눈값 후 3으로 나눠지는지 체크
        //안되면 나눈값 - 1 씩 해보기
        //끝까지 안되면 -1 반환
        for (int i=x/5; i>=0; i--) {
            if(x - i*5 == 0) {
                System.out.println(i);
                flag = false;
                break;
            } else if ((x - i*5) %3 == 0) {
                count =(x - i*5) /3;
                System.out.println(count + i);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(-1);
        }
    }
}