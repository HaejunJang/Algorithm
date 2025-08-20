import java.io.*;
import java.util.*;

public class Main {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int count =0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];
        for (int i=1; i<=n; i++) {
            graph[i] = new ArrayList<>();
        }
        //네트워크 연결 입력
        for (int i=0; i<m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        int result = bfs(1);
        System.out.println(result);
    }
    static int bfs(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        visited[start] = true;
        q.add(start);

        int count = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int next : graph[cur]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                    count++;
                }
            }
        }
        return count;
    }
}