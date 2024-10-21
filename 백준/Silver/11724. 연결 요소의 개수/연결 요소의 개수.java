import java.util.Scanner;

public class Main {
    static int N, M;
    static int[][] graph;
    static boolean[] visited;
    static int count;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        graph = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i = 0; i < M; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            graph[u][v] = graph[v][u] = 1;
        }

        count = 0;
        for(int i = 1; i < N+1; i++) {
            if(!visited[i]) {
                DFS(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void DFS(int node) {
        visited[node] = true;
        for(int i = 1; i <= N; i++) {
            if(!visited[i] && graph[node][i] == 1) {
                DFS(i);
            }
        }

    }
}
