import java.util.*;

public class Main {
    public static void main(String[] args) {
        //3개 연속 fizz가 안온다고 가정하고 시작
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr =new String[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                //단어 길이가 같은 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(arr[0]);
        for (int i=1; i< n; i++) {
            // 중복되지 않는 단어만 출력
            if (!arr[i].equals(arr[i-1])) {
                System.out.println(arr[i]);
            }
        }
    }
}